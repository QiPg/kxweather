package com.example.kxweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 农启兵 on 2018/2/5.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forcast")
    public List<Forecast> forecasts;
}
