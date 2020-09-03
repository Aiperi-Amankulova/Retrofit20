package com.example.retrofit.Room

import Weather
import android.text.TextUtils
import androidx.room.TypeConverter
import com.example.retrofit.Data.Model.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object TypeConverter {

    @JvmStatic
    @TypeConverter
    fun CoordtoString(model: CoordModel): String {
        return Gson().toJson(model)
    }

    @JvmStatic
    @TypeConverter
    fun coordtoObject(text: String): CoordModel? {
        if (TextUtils.isEmpty(text))
            return null
        return Gson().fromJson(text, CoordModel::class.java)
    }


    @JvmStatic
    @TypeConverter
    fun citytoString(model: CityModel): String {
        return Gson().toJson(model)
    }

    @JvmStatic
    @TypeConverter
    fun citytoObject(text: String): CityModel? {
        if (TextUtils.isEmpty(text))
            return null
        return Gson().fromJson(text, CityModel::class.java)
    }

    @JvmStatic
    @TypeConverter
    fun ForcastModelString(model: Forescat): String {
        return Gson().toJson(model)
    }

    @JvmStatic
    @TypeConverter
    fun ForcastModelObject(text: String): Forescat? {
        if (TextUtils.isEmpty(text))
            return null
        return Gson().fromJson(text, Forescat::class.java)
    }
    @JvmStatic
    @TypeConverter
    fun ForcastDailyString(model: ForcastModel): String {
        return Gson().toJson(model)
    }

    @JvmStatic
    @TypeConverter
    fun ForcastDailyObject(text: String): ForcastModel? {
        if (TextUtils.isEmpty(text))
            return null
        return Gson().fromJson(text, ForcastModel::class.java)
    }

    @JvmStatic
    @TypeConverter
    fun FortempString(model: FortempModel): String {
        return Gson().toJson(model)
    }

    @JvmStatic
    @TypeConverter
    fun FortempObject(text: String): FortempModel? {
        if (TextUtils.isEmpty(text))
            return null
        return Gson().fromJson(text, FortempModel::class.java)
    }
    @JvmStatic
    @TypeConverter
    fun listString(model: List<ForcastModel>): String {
        return Gson().toJson(model)
    }

    @JvmStatic
    @TypeConverter
    fun listObject(text: String?): List<ForcastModel>? {
        if (text == null) return mutableListOf()
        val typeToken = object : TypeToken<List<ForcastModel>>() {}.type
        return Gson().fromJson(text, typeToken)
    }

    @JvmStatic
    @TypeConverter
    fun weatherString(model: List<Weather>): String {
        return Gson().toJson(model)
    }

    @JvmStatic
    @TypeConverter
    fun weatherObject(text: String?): List<Weather>? {
        if (text == null) return mutableListOf()
        val typeToken = object : TypeToken<List<Weather>>() {}.type
        return Gson().fromJson(text, typeToken)
    }
}