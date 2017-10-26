package com.lizewen.mystore.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by lizewen on 2017/10/26.
 * company:SDJ
 * email:lizewencn@126.com
 */

public abstract class CommonRecycleAdapter<T, VH extends CommonViewHolder> extends RecyclerView.Adapter<VH> {


    protected Context context;
    protected List<T> dataList;
    private LayoutInflater inflater;

    public CommonRecycleAdapter(Context context, List<T> dataList) {
        this.context = context;
        this.dataList = dataList;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType){
        return createView(parent, viewType, inflater);
    }

    protected abstract VH createView(ViewGroup parent, int viewType, LayoutInflater inflater);


    @Override
    public void onBindViewHolder(VH holder, int position) {
        binderViewHolder(holder,position,dataList);
    }

    protected abstract void binderViewHolder(VH holder, int position, List<T> dataList);

    @Override
    public int getItemCount() {
        return dataList == null ? 0 : dataList.size();
    }




}

class CommonViewHolder extends RecyclerView.ViewHolder {

    public CommonViewHolder(View itemView) {

        super(itemView);
    }
}