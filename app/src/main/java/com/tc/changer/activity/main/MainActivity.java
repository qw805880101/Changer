package com.tc.changer.activity.main;


import android.widget.TextView;

import com.tc.changer.R;
import com.tc.mvp.MVPBaseActivity;


/**
 * MVPPlugin
 */

public class MainActivity extends MVPBaseActivity<MainContract.View, MainPresenter> implements MainContract.View {

    private TextView tx;

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
//        Intent intent = this.getIntent();
//        User user = (User) intent.getSerializableExtra("user");
//        tx.setText("mobile:" + user.getMobile() + "\nname:" + user.getName());
    }

    @Override
    public void getSuccess(Object obj, String reqName) {

    }

    @Override
    public void getFail(String failLog, String requestHead) {

    }
}
