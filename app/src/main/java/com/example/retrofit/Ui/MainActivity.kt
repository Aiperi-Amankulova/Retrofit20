package com.example.retrofit.Ui

import Json4Kotlin_Base
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
            ?.getWeather("Washington", getString(R.string.api))
            ?.enqueue(object : Callback<Json4Kotlin_Base> {
                override fun onFailure(call: Call<Json4Kotlin_Base>, t: Throwable) {
                }

                override fun onResponse(
                    call: Call<Json4Kotlin_Base>,
                    response: Response<Json4Kotlin_Base>
                ) {
                    if (response.isSuccessful && response.body() != null) {
                        val data = response.body()
                        textView.text = data?.main?.temp.toString()
                    }
                }

                private fun formatDate() {
                    val tv= SimpleDateFormat("d", Locale.getDefault())
                    val date = Date()
                    val day = tv.format(date)
                    textView2.text = day
                    val sfdMonth = SimpleDateFormat("MMMM\nyyyy", Locale.getDefault())
                    val month = sfdMonth.format(date)
                    textView3.text = month
                }
                )
            }
    }
    }


