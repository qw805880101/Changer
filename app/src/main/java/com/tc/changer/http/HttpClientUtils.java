package com.tc.changer.http;

/**
 * 作者：tc on 2017/4/12.
 * 邮箱：qw805880101@qq.com
 * 版本：v1.0
 */
public class HttpClientUtils {

//    private static OkHttpClient.Builder mOkHttpClient = new OkHttpClient.Builder();
//    private static Request request;
//
//    public static Object httpConnect(String url, Class cla) {
//        request = new Request.Builder()
//                .url(url).build();
//        mOkHttpClient.connectTimeout(10, TimeUnit.SECONDS)
//                .readTimeout(20, TimeUnit.SECONDS);
//        Call call = mOkHttpClient.build().newCall(request);
//        try {
//            Response response = call.execute();
//            return JSON.parseObject(response.body().string(), cla);
//        } catch (IOException e) {
//            if (e.getCause().getClass().equals(SocketTimeoutException.class)) {
//                Info.HttpConnectErro = "连接超时";
//            } else if (e.getCause().getClass().equals(ConnectException.class)) {
//                Info.HttpConnectErro = "网络连接错误";
//            }
//            return null;
//        }
//    }
}
