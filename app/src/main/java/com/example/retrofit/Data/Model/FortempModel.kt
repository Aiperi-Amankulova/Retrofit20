package com.example.retrofit.Data.Model

import Weather
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
@Entity
class FortempModel (
    @PrimaryKey
    val id: Int,
    val day : Double,
    val min : Double,
    val max : Double,
    val night : Double,
    val eve : Double,
    val morn : Double,
    @SerializedName("weather") val weather : List<Weather>
)