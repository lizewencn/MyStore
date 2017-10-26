package com.lizewen.mystore.http;

import android.content.Context;

import com.lizewen.mystore.bean.MainBean;

import java.util.concurrent.TimeUnit;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lizewen on 2017/10/24.
 * company:SDJ
 * email:lizewencn@126.com
 * <p>
 * 网络请求客户端
 */

public class RetrofitClient {
    //请求超时时间
    private static final int TIMEOUT = 10;
    private static RetrofitClient newInstatnce;
    private static final String BASE_URL = " http://zscat.tunnel.qydev.com/";
//    private static final String BASE_URL = "https://api.douban.com/v2/movie/";


    private APIService apiService;

    private RetrofitClient(Context context) {
        initClient(context);

    }


    public static RetrofitClient getNewInstatnce(Context context) {
        if (newInstatnce == null) {
            newInstatnce = new RetrofitClient(context);
        }
        return newInstatnce;
    }

    private void initClient(Context context) {
        OkHttpClient client = new OkHttpClient.Builder()
//                .cookieJar(new CookieManager(context))
                .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                .addInterceptor(new BaseInterceptor())
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build();
        apiService = retrofit.create(APIService.class);
    }

    public void getMainInfo(BaseCallBackObserve<MainBean> observe){
        apiService.getMainInfo()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observe);
    }
}
