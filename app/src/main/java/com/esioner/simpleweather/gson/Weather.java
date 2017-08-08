package com.esioner.simpleweather.gson;

import com.esioner.simpleweather.gson.weatherBean.Aqi;
import com.esioner.simpleweather.gson.weatherBean.Basic;
import com.esioner.simpleweather.gson.weatherBean.Forecast;
import com.esioner.simpleweather.gson.weatherBean.Now;
import com.esioner.simpleweather.gson.weatherBean.Suggestion;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Create: 2017/8/8
 */

public class Weather {
    public String status;
    public Basic basic;
    public Aqi aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
