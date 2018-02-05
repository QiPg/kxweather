package com.example.kxweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 农启兵 on 2018/2/5.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public  Update update;
    public class  Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
