package com.lizewen.mystore.http;

/**
 * Created by lizewen on 2017/10/25.
 * company:SDJ
 * email:lizewencn@126.com
 *
 * 网络请求返回的数据
 */

public class ResponseBean<T> {

    private int errno;//0 成功,1 失败,3 参数为空
    private String errmsg;
    private T data;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseBean{" +
                "errno=" + errno +
                ", errmsg='" + errmsg + '\'' +
                ", data=" + data +
                '}';
    }
}
