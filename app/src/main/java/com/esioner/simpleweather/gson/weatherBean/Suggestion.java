package com.esioner.simpleweather.gson.weatherBean;

import com.google.gson.annotations.SerializedName;

/**
 * Create: 2017/8/8
 */

public class Suggestion {
    /**
     * 舒适指数
     */
    @SerializedName("comf")
    public Comfort comfort;
    /**
     * 洗车指数
     */
    @SerializedName("cw")
    public CarWash carWash;
    /**
     * 运动指数
     */
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
