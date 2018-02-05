package com.example.kxweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 农启兵 on 2018/2/5.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
