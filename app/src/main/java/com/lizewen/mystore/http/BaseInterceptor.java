package com.lizewen.mystore.http;

import com.orhanobut.logger.Logger;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by lizewen on 2017/10/24.
 * company:SDJ
 * email:lizewencn@126.com
 *
 * 网络拦截器
 */

public class BaseInterceptor implements Interceptor {

    private Map<String, String> header;
    public BaseInterceptor(){

    }
    public BaseInterceptor(Map<String, String> header) {
        this.header = header;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        if (header == null || header.isEmpty()) {
            Response response = chain.proceed(chain.request());
//            Logger.i(response.body().string());
            return response;
        }
        Logger.e(chain.request().url().toString());
        Request.Builder newBuilder = chain.request().newBuilder();
        Set<String> keySet = header.keySet();
        for (String key : keySet) {
            String value = header.get(key);
            newBuilder.addHeader(key, value);

        }

        return chain.proceed(newBuilder.build());
    }
}
