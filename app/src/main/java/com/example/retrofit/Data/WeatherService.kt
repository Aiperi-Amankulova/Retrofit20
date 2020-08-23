package com.example.retrofit.Data

import Json4Kotlin_Base
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherService {

    @GET("data/2.5/forecast/hourly")
    fun getWeather
           (@Query("q") city: String,
            @Query("appid") appid : String) : Call <Json4Kotlin_Base>

}