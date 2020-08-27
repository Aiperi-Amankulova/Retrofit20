package com.example.retrofit.Data.Model

data class Model(
    val cod: String,
    val message: Int,
    val cnt: Int,
    val city: CityModel,
    val list: List<ItemModel>
)