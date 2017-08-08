package com.esioner.simpleweather.gson.weatherBean;

import com.google.gson.annotations.SerializedName;

public class Basic {
    /**
     * 有些字段不适合直接作为 Java 字段来命名，使用 @SerializedName 注解的方式
     * 来让 JSON 字段和 Java 字段之间建立映射关系
     */
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
