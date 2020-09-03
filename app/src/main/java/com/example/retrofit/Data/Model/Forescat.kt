package com.example.retrofit.Data.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Forescat(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val cod: String,
    val message: Int,
    val cnt: Int,
    val city: CityModel,
    val daily: List<ForcastModel>
)