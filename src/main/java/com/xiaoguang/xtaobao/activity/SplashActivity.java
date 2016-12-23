package com.xiaoguang.xtaobao.activity;

import android.content.Intent;
import android.os.Bundle;

import com.xiaoguang.xtaobao.R;
import com.xiaoguang.xtaobao.base.BaseActivity;

/**
 * 预先加载数据的SplashActivity
 */
public class SplashActivity extends BaseActivity {

    //进入下一个Activity
    Runnable goToMainActivity = new Runnable() {

        @Override
        public void run() {
            SplashActivity.this.startActivity(new Intent(SplashActivity.this,
                    HomeActivity.class));
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splash);
        //实现沉浸式通知栏
        immersiveNotification();
        //durring = 0时默认3秒后进入系统
        countDown(goToMainActivity,0);
    }
}
