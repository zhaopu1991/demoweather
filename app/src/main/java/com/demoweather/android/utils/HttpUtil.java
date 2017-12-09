package com.demoweather.android.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zhaopu on 2017/12/8.
 */

public class HttpUtil {

    public static void sendOkHttpResquest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
