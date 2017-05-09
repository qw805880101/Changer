package com.tc.changer.activity.login;


import android.util.Log;

import com.tc.changer.bean.User;
import com.tc.changer.http.Async;
import com.tc.changer.http.HttpConnectListener;
import com.tc.changer.utils.ReqMethod;
import com.tc.mvp.BasePresenterImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * MVPPlugin
 *
 */

public class LoginPresenter extends BasePresenterImpl<LoginContract.View> implements HttpConnectListener, LoginContract.Presenter{

    @Override
    public void login(User user) {
        Log.d("tc", "login: ");
        Map map = new HashMap();
        map.put("userMobile", user.getMobile());
        map.put("password", user.getPassword());
        new Async(this, map, ReqMethod.USER_QUERY, User.class).execute();
    }

    @Override
    public void onSuccess(Object result, String requestHead) {
        mView.getSuccess(result, requestHead);
    }

    @Override
    public void onFail(String failLog, String requestHead) {
        mView.getFail(failLog,requestHead);
    }
}
