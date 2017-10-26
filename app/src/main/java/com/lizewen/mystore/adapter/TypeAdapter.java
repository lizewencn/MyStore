package com.lizewen.mystore.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lizewen.mystore.R;
import com.lizewen.mystore.bean.GoodsType;

import java.util.List;

/**
 * Created by lizewen on 2017/10/26.
 * company:SDJ
 * email:lizewencn@126.com
 */

public class TypeAdapter extends CommonRecycleAdapter<GoodsType,TypeHolder>{
    public TypeAdapter(Context context, List<GoodsType> dataList) {
        super(context, dataList);
    }


    @Override
    protected TypeHolder createView(ViewGroup parent, int viewType, LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.item_layout_type, parent, false);
//        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
//        layoutParams.width = ScreenUtil.getScreenWith(context);
//        view.setLayoutParams(layoutParams);
        return new TypeHolder(view);
    }

    @Override
    protected void binderViewHolder(TypeHolder holder, int position, List<GoodsType> dataList) {
//        holder.tv.setText(dataList.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

class TypeHolder extends CommonViewHolder {

    ImageView iv;
    TextView tv;
    public TypeHolder(View itemView) {
        super(itemView);
        iv = (ImageView) itemView.findViewById(R.id.iv_item_type);
        tv = (TextView) itemView.findViewById(R.id.tv_item_type);
    }


}


