package com.esioner.simpleweather.db;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {

    private int id;
    private String countryName; //县的名称
    private String weatherId; //天气 Id
    private int cityId; //当前县所属的市的 id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
