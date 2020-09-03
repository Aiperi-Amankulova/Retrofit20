package com.example.retrofit.Room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.retrofit.Data.Model.ForcastModel

@Dao
interface DaoFun {
    @Insert
    fun add(data : ForcastModel)

    @Query("SELECT * FROM FORCASTMODEL")
    fun getAll(): List<ForcastModel>

    @Query("DELETE FROM FORCASTMODEL")
    fun deleteAll()

}