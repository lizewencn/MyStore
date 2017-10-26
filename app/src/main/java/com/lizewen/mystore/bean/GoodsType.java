package com.lizewen.mystore.bean;

import java.util.List;

/**
 * Created by lizewen on 2017/10/26.
 * company:SDJ
 * email:lizewencn@126.com
 */

public class GoodsType {
    private int id;//13,
    private String name;//智能家居",
    private String createBy;// null,
    private String createDate;// null,
    private String delFlag;// "0",
    private List<GoodsBean> goods_list;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public List<GoodsBean> getGoods_list() {
        return goods_list;
    }

    public void setGoods_list(List<GoodsBean> goods_list) {
        this.goods_list = goods_list;
    }
}
