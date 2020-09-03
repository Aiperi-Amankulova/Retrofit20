package com.example.retrofit.Data.Model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.RowId

@Entity
data class ForcastModel (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val dt: Int,
    val sunrise: Int,
    val sunset: Int,
    val pressure : Int,
    val humidity : Int,
    val dew_point : Double,
    val wind_speed: Double,
    val wind_deg:Int,
    val clouds : Int,
    val pop : Double,
    val rain : Double,
    val uvi : Double,
    val temp : FortempModel
)