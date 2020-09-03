package com.example.retrofit.Room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.retrofit.Data.Model.*

@Database(entities = [CityModel ::class, CoordModel::class,Forescat::class,
    ForcastModel::class,FortempModel::class], version = 1, exportSchema = false)
@TypeConverters(value = [TypeConverter::class])
abstract class DataBaseAbstract : RoomDatabase() {
    abstract fun getDao(): DaoFun


}