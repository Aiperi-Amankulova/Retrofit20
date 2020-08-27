package com.example.retrofit.Ui

import CurrentWeather
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofit.Data.Model.Model
import com.example.retrofit.Data.RetrofitBuilder
import com.example.retrofit.R
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RetrofitBuilder.getService()
            ?.getWeatherForecast("New York", getString(R.string.api), "metric")
            ?.enqueue(object : Callback<CurrentWeather> {
                override fun onFailure(call: Call<CurrentWeather>, t: Throwable) {
                }

                override fun onResponse(
                    call: Call<CurrentWeather>,
                    response: Response<CurrentWeather>
                ) {
                    if (response.isSuccessful && response.body() != null) {
                        val data = response.body()
                        textView.text = data?.main?.temp.toString()
                    }
                }
            })

    }

    private fun formatDate() {
        val tv = SimpleDateFormat("d", Locale.getDefault())
        val date = Date()
        val day = tv.format(date)
        textView2.text = day
        val sfdMonth = SimpleDateFormat("MMMM\nyyyy", Locale.getDefault())
        val month = sfdMonth.format(date)
        textView3.text = month
    }

    fun forecastWeather(city: String) {
        RetrofitBuilder
            .getService()?.getWeatherForecast(city, getString(R.string.api), "metric")
            ?.enqueue(object : Callback<Model> {
                override fun onResponse(
                    call: Call<Model>,
                    response: Response<Model>
                ) {

                }

                override fun onFailure(call: Call<Model>, t: Throwable) {
                    Log.d("kj", "jj")
                }
            })
    }
}

