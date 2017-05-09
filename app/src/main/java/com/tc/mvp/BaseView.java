package com.tc.mvp;

import android.content.Context;

/**
 * MVPPlugin
 *
 */

public interface BaseView {
     Context getContext();
     void getSuccess(Object obj, String reqName);
     void getFail(String failLog, String requestHead);
}
