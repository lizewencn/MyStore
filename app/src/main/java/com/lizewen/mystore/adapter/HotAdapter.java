package com.lizewen.mystore.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lizewen.mystore.R;
import com.lizewen.mystore.bean.GoodsBean;

import java.util.List;

/**
 * Created by lizewen on 2017/10/26.
 * company:SDJ
 * email:lizewencn@126.com
 */

public class HotAdapter extends CommonRecycleAdapter<GoodsBean,HotHolder> {
    public HotAdapter(Context context, List<GoodsBean> dataList) {
        super(context, dataList);
    }

    @Override
    protected HotHolder createView(ViewGroup parent, int viewType, LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.item_layout_type, parent, false);
        return new HotHolder(view);
    }

    @Override
    protected void binderViewHolder(HotHolder holder, int position, List<GoodsBean> dataList) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}

class HotHolder extends CommonViewHolder {

    ImageView iv;
    TextView tv;

    public HotHolder(View itemView) {
        super(itemView);
        iv = (ImageView) itemView.findViewById(R.id.iv_item_type);
        tv = (TextView) itemView.findViewById(R.id.tv_item_type);
    }
}


