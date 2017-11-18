package com.weather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by acer-pc on 2017/11/18.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    public int getCityId(int cityId){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}
