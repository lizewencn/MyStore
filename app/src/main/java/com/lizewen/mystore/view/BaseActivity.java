package com.lizewen.mystore.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initListener();
        iniData();
    }

    protected abstract void initView();

    protected abstract void initListener();

    protected abstract void iniData();


}
