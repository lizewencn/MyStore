package com.lizewen.mystore.bean;

import java.util.List;

/**
 * Created by lizewen on 2017/10/26.
 * company:SDJ
 * email:lizewencn@126.com
 *
 * 主界面一大堆信息
 */

public class MainBean {

    private List<GoodsType> goodsTypeList;
    private List<BannerBean> bannerList;
    private List<GoodsBean> commList;
    private List<CouponBean> couponList;
    private List<GoodsBean> hitList;
    private List<NavBean> nav_icon_list;
    private List<GoodsBean> xinpinList;
    private List<TopicBean> topicList;
    private StoreBean store;

    public List<GoodsType> getGoodsTypeList() {
        return goodsTypeList;
    }

    public void setGoodsTypeList(List<GoodsType> goodsTypeList) {
        this.goodsTypeList = goodsTypeList;
    }

    public List<BannerBean> getBannerList() {
        return bannerList;
    }

    public void setBannerList(List<BannerBean> bannerList) {
        this.bannerList = bannerList;
    }

    public List<GoodsBean> getCommList() {
        return commList;
    }

    public void setCommList(List<GoodsBean> commList) {
        this.commList = commList;
    }

    public List<CouponBean> getCouponList() {
        return couponList;
    }

    public void setCouponList(List<CouponBean> couponList) {
        this.couponList = couponList;
    }

    public List<GoodsBean> getHitList() {
        return hitList;
    }

    public void setHitList(List<GoodsBean> hitList) {
        this.hitList = hitList;
    }

    public List<NavBean> getNav_icon_list() {
        return nav_icon_list;
    }

    public void setNav_icon_list(List<NavBean> nav_icon_list) {
        this.nav_icon_list = nav_icon_list;
    }

    public List<GoodsBean> getXinpinList() {
        return xinpinList;
    }

    public void setXinpinList(List<GoodsBean> xinpinList) {
        this.xinpinList = xinpinList;
    }

    public List<TopicBean> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<TopicBean> topicList) {
        this.topicList = topicList;
    }

    public StoreBean getStore() {
        return store;
    }

    public void setStore(StoreBean store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "MainBean{" +
                "goodsTypeList=" + goodsTypeList +
                ", bannerList=" + bannerList +
                ", commList=" + commList +
                ", couponList=" + couponList +
                ", hitList=" + hitList +
                ", nav_icon_list=" + nav_icon_list +
                ", xinpinList=" + xinpinList +
                ", topicList=" + topicList +
                ", store=" + store +
                '}';
    }
}
