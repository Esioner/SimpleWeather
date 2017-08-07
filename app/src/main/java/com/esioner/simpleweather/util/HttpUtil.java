package com.esioner.simpleweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    private static OkHttpClient mClient;

    //创建实例
    public static synchronized OkHttpClient getInstance() {
        if (mClient == null) {
            mClient = new OkHttpClient();
        }
        return mClient;
    }

    public static void sendOkHttpRequest(String url, Callback callback){
        getInstance();
        Request request = new Request.Builder()
                .url(url)
                .build();
        mClient.newCall(request).enqueue(callback);
    }
}
