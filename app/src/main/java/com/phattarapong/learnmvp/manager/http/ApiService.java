package com.phattarapong.learnmvp.manager.http;

import com.phattarapong.learnmvp.home.model.Wethertoday;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public interface ApiService {

    @GET("WeatherToday/V1/?type=json")
    Call<Wethertoday> getWeatherToDay();

}
