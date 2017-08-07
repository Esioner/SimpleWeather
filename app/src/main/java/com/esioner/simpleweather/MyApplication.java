package com.esioner.simpleweather;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;


public class MyApplication extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePalApplication.initialize(context);
    }

    //获取全局上下文
    public static Context getContext() {
        return context;
    }
}
