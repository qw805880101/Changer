package com.tc.changer.activity.main;

import android.content.Context;

import com.tc.mvp.BasePresenter;
import com.tc.mvp.BaseView;

/**
 * MVPPlugin
 *
 */

public class MainContract {
    interface View extends BaseView {
        
    }

    interface  Presenter extends BasePresenter<View> {
        
    }
}
