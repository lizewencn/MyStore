package com.lizewen.mystore.http;

import com.lizewen.mystore.bean.MainBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by lizewen on 2017/10/24.
 * company:SDJ
 * email:lizewencn@126.com
 */

public interface APIService {



    @GET("small/default/index1")
    Observable<ResponseBean<MainBean>> getMainInfo();


}
