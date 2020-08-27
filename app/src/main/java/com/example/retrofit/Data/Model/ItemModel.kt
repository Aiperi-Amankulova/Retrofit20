package com.example.retrofit.Data.Model

data class ItemModel (
    val dt: Int,
    val visibility: Int,
    val pop: Double,
    val dt_txt: String,
    val main: MainModel,
    val weather: List<WeatherItem>,
    val clouds: CloudsModel,
    val wind: WindModel,
    val sys: SysModel
)