package com.demoweather.android.gson;

/**
 * Created by zhaopu on 2017/12/9.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
