package com.parallaxscroll.louis.pullparallaxscrollview;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTranslucentStatus(true);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ImageView iv_user_cover = (ImageView) findViewById(R.id.iv_user_cover);
        PullParallaxScrollView rsv_user_info = (PullParallaxScrollView) findViewById(R.id.rsv_user_info);
        rsv_user_info.setHeader(iv_user_cover);
    }

    @TargetApi(19)
    protected void setTranslucentStatus(boolean on) {
        Window win = getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }
}
