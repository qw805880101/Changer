package com.tc.changer.activity.login;


import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.tc.changer.R;
import com.tc.changer.bean.User;
import com.tc.mvp.MVPBaseActivity;


/**
 * MVPPlugin
 */

public class LoginActivity extends MVPBaseActivity<LoginContract.View, LoginPresenter> implements LoginContract.View, OnClickListener {

    private TextView tx;
    private User user;

    @Override
    public void setLayout() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void findyView() {
        tx = $(R.id.text);
    }

    @Override
    public void getData() {
        user = new User();
        user.setMobile("15201751883");
        user.setPassword("123456");
//        mPresenter.login(user);
        //创建okHttpClient对象
    }

    @Override
    public void getSuccess(Object obj, String reqName) {
        User user = (User) obj;
        tx.setText("reqName: " + reqName + "|" + user.toString());
    }

    @Override
    public void getFail(String failLog, String requestHead) {
        Log.d(TAG, "getFail: " + failLog);
    }

    @Override
    public void onClick(View v) {
//        if (v == bt) {
//            user = new User();
//            user.setMobile("15201751883");
//            user.setName("田超");
//            Intent intent = new Intent(this, MainActivity.class);
//            intent.putExtra("user", user);
//            this.startActivity(intent);
//        }
    }
}
