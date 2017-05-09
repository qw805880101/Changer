package com.tc.changer.http;

/**
 * Created by tc on 2017/3/6.
 */

public interface HttpConnectListener {

    /**
     * 网络链接成功
     *
     * @param result      返回对象
     * @param requestHead 报文头
     */
    void onSuccess(Object result, String requestHead);

    /**
     * 网络链接失败
     *
     * @param failLog     失败日志
     * @param requestHead 报文头
     */
    void onFail(String failLog, String requestHead);

}
