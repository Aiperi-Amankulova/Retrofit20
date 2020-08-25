package com.example.retrofit.Data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    private var weatherSer : WeatherService? = null

    fun getService() : WeatherService? {
        if ( weatherSer == null )
            weatherSer = buildRetrofit()

        return weatherSer
    }

    private fun  buildRetrofit() : WeatherService {

        val service =
            Retrofit.Builder()
                .baseUrl("http://api.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(WeatherService:: class.java)


        return service

    }


}