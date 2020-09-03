package com.example.retrofit.Ui

import CurrentWeather
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofit.Data.RetrofitBuilder
import com.example.retrofit.Data.Utils.LocationUtils
import com.example.retrofit.Data.Utils.NetworkUtils
import com.example.retrofit.R
import com.google.android.gms.location.LocationServices
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private val adapter = RecyclerviewAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = adapter

        formatDate()
        WeatherSnackbar()

        if (LocationUtils.checkLocationPermission(this)) {
            Locattion()
        }
    }

    private fun formatDate() { //дата и год
        val tv = SimpleDateFormat("d", Locale.getDefault())
        val date = Date()
        val day = tv.format(date)
        number.text = day
        val sfdMonth = SimpleDateFormat("MMMM\nyyyy", Locale.getDefault())
        val month = sfdMonth.format(date)
        calendarDay.text = month
    }

    private fun  getSnackbar() {   //(1)
        Snackbar.make(parentLayout, "Нет подключения", Snackbar.LENGTH_INDEFINITE)
            .setAction("Обновить") {
                if (!NetworkUtils.isNetworkCheck(this)) {
                    getSnackbar()
                }
            }.show()
    }

    private fun WeatherSnackbar() {   // (2)
        val isHasNetwork = NetworkUtils.isNetworkCheck(this)
        if (!isHasNetwork) {
            getSnackbar()
        }
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == LocationUtils.LOCATION_REQUEST_CODE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED)
                Locattion()
        }
    }

    @SuppressLint("MissingPermission")
    private fun Locattion() {
        val fpc = LocationServices.getFusedLocationProviderClient(applicationContext)
        fpc.lastLocation.addOnSuccessListener {
            LoadByLocation(it)
        }.addOnFailureListener {

        }
    }

    fun LoadByLocation(location: Location) {
        RetrofitBuilder.getService()?.getWeatherFromCoord(
            location.latitude.toString(), location.longitude.toString(),
            getString(R.string.api), "metric"
        )?.enqueue(object : Callback<CurrentWeather> {
            override fun onResponse(
                call: Call<CurrentWeather>,
                response: Response<CurrentWeather>
            ) {
                val city = response.body()?.name
                val min = response.body()?.main?.temp_min
                val max = response.body()?.main?.temp_max
                val pressure = response.body()?.main?.pressure
                val humidity = response.body()?.main?.humidity
                val cloud = response.body()?.clouds?.all
                val wind = response.body()?.wind?.speed
                val sunrise = response.body()?.timezone
                val temp = response.body()?.main?.temp
                val feels = response.body()?.main?.feels_like

                textView.text = city.toString()
                number2.text = cloud.toString()
                textView3.text = max?.toInt().toString()
                textView5.text = min?.toInt().toString()
                textView10.text = wind.toString()
                textView15.text = pressure.toString()
                textView12.text = humidity.toString()
                textView17.text = humidity.toString()

            }

            override fun onFailure(call: Call<CurrentWeather>, t: Throwable) {
                Log.d("blabla", "blabla")

            }

        })
    }


}