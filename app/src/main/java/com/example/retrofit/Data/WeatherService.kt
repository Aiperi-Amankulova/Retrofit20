package com.example.retrofit.Data

import Json4Kotlin_Base
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherService {

    @GET("data/2.5/weather")
    fun getWeather(
        @Query("q") city: String,
        @Query("appid") appid: String,
        @Query("uts") uts: String

    ): Call<Json4Kotlin_Base>

    @GET("data/2.5/forecast")
    fun forecast(
        @Query("q") city: String,
        @Query("appid") appid: String,
        @Query("units") units : String
    ) : Call<Json4Kotlin_Base>



}
