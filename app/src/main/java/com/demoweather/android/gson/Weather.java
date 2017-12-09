package com.demoweather.android.gson;

import android.support.v4.app.NotificationCompat;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zhaopu on 2017/12/9.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
