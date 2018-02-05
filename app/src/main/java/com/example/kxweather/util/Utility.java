package com.example.kxweather.util;

import android.text.TextUtils;

import com.example.kxweather.db.City;
import com.example.kxweather.db.County;
import com.example.kxweather.db.Province;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * 处理返回数据类
 * Created by 农启兵 on 2018/2/2.
 */

public class Utility {
    //各省数据
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allProvinces=new JSONArray(response);
                for(int i=0;i<allProvinces.length();i++){
                    JSONObject provinceObject=allProvinces.getJSONObject(i);
                    Province province=new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
            }
                return true;
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        return false;
    }
    //城市数据
    public static boolean handelCityResponse(String response,int provinceId){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allCities=new JSONArray(response);
                for(int i=0;i<allCities.length();i++){
                    JSONObject cityObject=allCities.getJSONObject(i);
                    City city=new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
            }catch (Exception e){
               e.printStackTrace();
            }
            return true;
        }
        return false;
    }
    //县数据
    public static boolean handelConntyResponse(String response,int cityId){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allConnties=new JSONArray(response);
                for(int i=0;i<allConnties.length();i++){
                    JSONObject countyObject=allConnties.getJSONObject(i);
                    County county=new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }

}
