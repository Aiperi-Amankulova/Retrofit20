package com.example.retrofit.Ui

import android.app.Application
import androidx.room.Room
import com.example.retrofit.Room.DataBaseAbstract

class ApplicationWeather : Application() {

    private val dataBase : DataBaseAbstract? = null

    override fun onCreate() {
        super.onCreate()
        app= this

        val dataBase = Room.databaseBuilder(applicationContext, DataBaseAbstract::class.java,DB_Name)
            .allowMainThreadQueries()
            .build()
    }

    fun getDB() = dataBase

    companion object {
        private var app: ApplicationWeather? = null
        fun getApp() = app
        private const val DB_Name = "MY_DB"
    }

}