package com.weather.android.json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by acer-pc on 2017/11/18.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
