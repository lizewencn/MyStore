package com.lizewen.mystore.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by lizewen on 2017/10/23.
 * company:SDJ
 * email:lizewencn@126.com
 */

public class LZWScrollView extends ScrollView {

    private  OnScrollListener listener;
    public LZWScrollView(Context context) {
        super(context);
    }

    public LZWScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LZWScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        if(this.listener != null){
            this.listener.onScroll(l, t, oldl, oldt);
        }
        super.onScrollChanged(l, t, oldl, oldt);
    }

    public void setListener(OnScrollListener l){
        listener = l;
    }

    public interface OnScrollListener{
        void onScroll(int left,int top,int oldl,int oldt);
    }
}
