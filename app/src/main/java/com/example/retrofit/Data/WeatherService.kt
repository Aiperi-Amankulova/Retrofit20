package com.example.retrofit.Data

import CurrentWeather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherService {
    @GET("data/2.5/forecast")
    fun getWeatherForecast(
        @Query("q") city: String,
        @Query("appid") appId: String,
        @Query("units") units: String
    ): Call<CurrentWeather>

}
