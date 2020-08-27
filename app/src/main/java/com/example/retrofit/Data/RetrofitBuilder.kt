package com.example.retrofit.Data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    private var wearherSer: WeatherService? = null

    fun getService(): WeatherService? {
        if (wearherSer == null)
            wearherSer =
                buildRetrofit()

        return wearherSer
    }

    private fun buildRetrofit(): WeatherService {

        return Retrofit.Builder()
            .baseUrl("http://api.openweathermap.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WeatherService::class.java)
    }
}