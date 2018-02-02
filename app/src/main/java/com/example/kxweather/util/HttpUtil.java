package com.example.kxweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 请求数据类
 * Created by 农启兵 on 2018/2/2.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
