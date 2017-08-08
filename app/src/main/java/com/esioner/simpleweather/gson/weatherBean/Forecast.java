package com.esioner.simpleweather.gson.weatherBean;

import com.google.gson.annotations.SerializedName;

/**
 * Create: 2017/8/8
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;


    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

}
