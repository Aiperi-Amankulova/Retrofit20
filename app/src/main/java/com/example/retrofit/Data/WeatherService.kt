package com.example.retrofit.Data

import CurrentWeather
import com.example.retrofit.Data.Model.Forescat
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherService {
    @GET("data/2.5/weather")
    fun getWeather(
        @Query("q") city: String,
        @Query("appid") appid: String,
        @Query("units") units: String

    ) : Call<CurrentWeather>

    @GET("data/2.5/weather")
    fun getWeatherFromCoord(
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("appid") appid: String,
        @Query("units") units : String
    ) : Call<CurrentWeather>


    @GET("data/2.5/forecast")
    fun forecastWeather(
        @Query("q") city: String,
        @Query("appid") appid: String,
        @Query("units") units : String
    ) : Call<Forescat>


    @GET("data/2.5/onecall")
    fun onecallWeather(
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("exclude") exclude : String,
        @Query("appid") appid: String,
        @Query("units") units : String
    ) : Call<Forescat>

}
