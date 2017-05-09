package com.tc.changer.http;

import android.os.AsyncTask;

import com.tc.changer.utils.Info;
import com.tc.changer.utils.Util;

import java.util.Map;

/**
 * 作者：tc on 2017/4/12.
 * 邮箱：qw805880101@qq.com
 * 版本：v1.0
 */
public class Async extends AsyncTask<String, String, Object> {

    private HttpConnectListener connect;
    private String url = "";
    private String reqName;
    private Class cla;

    public Async(HttpConnectListener connect, Map map, String reqName, Class cla) {
        this.url = Util.getUrl(reqName, map);
        this.connect = connect;
        this.reqName = reqName;
        this.cla = cla;
    }

    protected Object doInBackground(String... params) {

        return null;
    }

    protected void onPostExecute(Object object) {
        if (object != null) {
            connect.onSuccess(object, reqName);
        } else {
            connect.onFail(Info.HttpConnectErro, reqName);
        }
    }

    @Override
    protected void onPreExecute() {

        System.out.println("窗口");

        super.onPreExecute();
    }
}
