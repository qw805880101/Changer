package com.tc.changer.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import com.tc.changer.R;
import com.tc.changer.activity.main.MainActivity;

/**
 * 作者：tc on 2017/4/17.
 * 邮箱：qw805880101@qq.com
 * 版本：v1.0
 */
public class TestActivity extends Activity {

    private Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            switch (msg.what) {
                case 0:
                    Intent intent = new Intent(TestActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                    break;
                case 1:
                    pb.incrementProgressBy(10);
                    break;

                default:
                    break;
            }
        }

        ;
    };
    private ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb = new ProgressBar(this);

        new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                        handler.sendEmptyMessage(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                handler.sendEmptyMessage(0);
            }

            ;
        }.start();

    }

}
