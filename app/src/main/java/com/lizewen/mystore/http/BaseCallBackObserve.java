package com.lizewen.mystore.http;

import com.orhanobut.logger.Logger;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * Created by lizewen on 2017/10/26.
 * company:SDJ
 * email:lizewencn@126.com
 */

public abstract class BaseCallBackObserve<T> implements Observer<ResponseBean<T>> {

    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }

    @Override
    public void onNext(@NonNull ResponseBean<T> tResponseBean) {
        Logger.e(tResponseBean.toString());
    }

    @Override
    public void onError(@NonNull Throwable e) {
        Logger.e(e.toString());
//        e.printStackTrace();
    }

    @Override
    public void onComplete() {

    }
}
