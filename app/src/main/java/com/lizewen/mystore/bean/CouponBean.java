package com.lizewen.mystore.bean;

/**
 * Created by lizewen on 2017/10/26.
 * company:SDJ
 * email:lizewencn@126.com
 * 优惠券
 */

public class CouponBean {


    private int id;
    private String addtime;
    private int status;
    private int amount;
    private String beginTime;
    private int couponCount;
    private String couponEndTime;
    private String couponName;
    private int couponOrderAmount;
    private String pic;
    private int isReceive;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponEndTime(String couponEndTime) {
        this.couponEndTime = couponEndTime;
    }

    public String getCouponEndTime() {
        return couponEndTime;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponOrderAmount(int couponOrderAmount) {
        this.couponOrderAmount = couponOrderAmount;
    }

    public int getCouponOrderAmount() {
        return couponOrderAmount;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPic() {
        return pic;
    }

    public void setIsReceive(int isReceive) {
        this.isReceive = isReceive;
    }

    public int getIsReceive() {
        return isReceive;
    }

}