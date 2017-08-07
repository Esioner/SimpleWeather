package com.esioner.simpleweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    private int id;
    private String cityName; //城市名称
    private int citeCode; //城市代号
    private int provinceId;//城市所属省份的 ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCiteCode() {
        return citeCode;
    }

    public void setCiteCode(int citeCode) {
        this.citeCode = citeCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
