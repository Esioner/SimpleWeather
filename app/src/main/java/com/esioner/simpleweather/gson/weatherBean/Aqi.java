package com.esioner.simpleweather.gson.weatherBean;

import com.google.gson.annotations.SerializedName;

/**
 * Create: 2017/8/8
 */

public class Aqi {

    public City city;

    public class City {
        public String aqi;
        public String pm25;
        @SerializedName("qlty")
        public String airQuality;
    }
}
