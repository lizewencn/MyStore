package com.lizewen.mystore.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lizewen on 2017/10/26.
 * company:SDJ
 * email:lizewencn@126.com
 */

public abstract class BaseFragment extends Fragment {
    private Context mContext;
    protected  String TAG;


    protected Context getAttachContext(){
        return mContext;

    }

    @Nullable
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        TAG = this.getClass().getName();
        View view = inflater.inflate(onInflateLayout(), null);
        initView(view);
        initListener();
        initData();
        return view;
    }

    protected abstract void initView(View view);

    protected abstract void initListener();

    protected void initData() {
        // TODO Auto-generated method stub

    }

    protected abstract int onInflateLayout();
}
