package com.tc.changer.activity.login;

import com.tc.changer.bean.User;
import com.tc.mvp.BasePresenter;
import com.tc.mvp.BaseView;

/**
 * MVPPlugin
 *
 */

public class LoginContract {
    interface View extends BaseView {

    }

    interface  Presenter extends BasePresenter<View> {
        void login(User user);
    }
}
