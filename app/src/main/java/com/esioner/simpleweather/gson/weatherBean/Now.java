package com.esioner.simpleweather.gson.weatherBean;

import com.google.gson.annotations.SerializedName;

/**
 * Create: 2017/8/8
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        public String code;
        /**
         * 天气状态：例如多云
         */
        @SerializedName("txt")
        public String info;
    }


}
