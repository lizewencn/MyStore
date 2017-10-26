package com.lizewen.mystore.view;

import android.graphics.Rect;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.lizewen.mystore.R;
import com.lizewen.mystore.adapter.HotAdapter;
import com.lizewen.mystore.adapter.TypeAdapter;
import com.lizewen.mystore.bean.BannerBean;
import com.lizewen.mystore.bean.GoodsBean;
import com.lizewen.mystore.bean.GoodsType;
import com.lizewen.mystore.bean.MainBean;
import com.lizewen.mystore.http.BaseCallBackObserve;
import com.lizewen.mystore.http.ResponseBean;
import com.lizewen.mystore.http.RetrofitClient;
import com.lizewen.mystore.widget.BannerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import io.reactivex.annotations.NonNull;

/**
 * Created by lizewen on 2017/10/26.
 * company:SDJ
 * email:lizewencn@126.com
 */

public class HomeFragment extends BaseFragment {

    @InjectView(R.id.main_toolbar)
    Toolbar toolbar;

    @InjectView(R.id.main_banner)
    BannerView bannerView;

    @InjectView(R.id.main_search_et)
    EditText etSearch;

    @InjectView(R.id.recycle_type)
    RecyclerView typeRecycle;

    @InjectView(R.id.recycle_new)
    RecyclerView newRecycle;
    @InjectView(R.id.recycle_hot)
    RecyclerView hotRecycle;

    private List<BannerBean> bannerList;
    private List<GoodsBean> newGoodsList;
    private List<GoodsBean> hotList;
    private List<GoodsType> typeList;

    private List<View> viewList;

    //两张轮播图
    private int[] imgs = {R.mipmap.banner1, R.mipmap.banner2, R.mipmap.banner3};
    @Override
    protected void initView(View view) {
        ButterKnife.inject(view);
        toolbar= (Toolbar) view.findViewById(R.id.main_toolbar);
        bannerView= (BannerView) view.findViewById(R.id.main_banner);
        etSearch= (EditText) view.findViewById(R.id.main_search_et);
        typeRecycle= (RecyclerView) view.findViewById(R.id.recycle_type);
        hotRecycle= (RecyclerView) view.findViewById(R.id.recycle_hot);
        newRecycle= (RecyclerView) view.findViewById(R.id.recycle_new);
        typeRecycle.setNestedScrollingEnabled(false);
        hotRecycle.setNestedScrollingEnabled(false);
        newRecycle.setNestedScrollingEnabled(false);
        initToolBar();
        initAD();
    }

    private void initAD() {
        viewList = new ArrayList<View>();
        for (int i = 0; i < imgs.length; i++) {
            ImageView image = new ImageView(getActivity());
            image.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            //设置显示格式
            image.setScaleType(ImageView.ScaleType.FIT_XY);
            image.setImageResource(imgs[i]);
            viewList.add(image);
        }
        bannerView.setViewList(viewList);
        bannerView.startLoop(true);
    }

    private void initToolBar() {


    }
    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {
        super.initData();
        RetrofitClient.getNewInstatnce(getActivity()).getMainInfo(new BaseCallBackObserve<MainBean>(){
            @Override
            public void onNext(@NonNull ResponseBean<MainBean> mainBeanResponseBean) {
                super.onNext(mainBeanResponseBean);
                bannerList = mainBeanResponseBean.getData().getBannerList();
                newGoodsList = mainBeanResponseBean.getData().getXinpinList();
                hotList = mainBeanResponseBean.getData().getHitList();
                typeList = mainBeanResponseBean.getData().getGoodsTypeList();
                updateUI();
            }

            @Override
            public void onError(@NonNull Throwable e) {
                super.onError(e);
                updateUI();
            }
        });

    }
    private void updateUI() {
        setTypeAdapter();
        setHotAdapter();
    }

    private void setTypeAdapter(){
        GridLayoutManager manager = new GridLayoutManager(getActivity(),2);
        typeRecycle.setLayoutManager(manager);

        typeRecycle.setItemAnimator(new DefaultItemAnimator());

        typeRecycle.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                int childAdapterPosition = parent.getChildAdapterPosition(view);
                if(childAdapterPosition%2 == 0){
                    outRect.right = 5;
                }else{
                    outRect.left = 5;
                }
            }
        });
        typeRecycle.setAdapter(new TypeAdapter(getActivity(),typeList));
    }

    private void setHotAdapter(){
        LinearLayoutManager manager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        hotRecycle.setLayoutManager(manager);

        hotRecycle.setItemAnimator(new DefaultItemAnimator());
        hotRecycle.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.top = 5;
            }
        });
        hotRecycle.setAdapter(new HotAdapter(getActivity(), hotList));
    }

    @Override
    protected int onInflateLayout() {
        return R.layout.fragment_home;
    }
}
