package com.lizewen.mystore.bean;

/**
 * Created by lizewen on 2017/10/26.
 * company:SDJ
 * email:lizewencn@126.com
 *
 * 专题
 */

public class TopicBean {


    private int id;
    private String title;
    private String createDate;
    private String stat;
    private String img;
    private int clickhit;
    private String remark;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    public String getCreateDate() {
        return createDate;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
    public String getStat() {
        return stat;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public String getImg() {
        return img;
    }

    public void setClickhit(int clickhit) {
        this.clickhit = clickhit;
    }
    public int getClickhit() {
        return clickhit;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getRemark() {
        return remark;
    }

}
