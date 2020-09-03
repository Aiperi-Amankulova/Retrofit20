package com.example.retrofit.Data.Model


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CoordModel (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val lat: Double,
    val ion : Double
)