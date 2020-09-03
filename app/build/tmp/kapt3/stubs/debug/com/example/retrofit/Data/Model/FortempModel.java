package com.example.retrofit.Data.Model;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/example/retrofit/Data/Model/FortempModel;", "", "id", "", "day", "", "min", "max", "night", "eve", "morn", "weather", "", "LWeather;", "(IDDDDDDLjava/util/List;)V", "getDay", "()D", "getEve", "getId", "()I", "getMax", "getMin", "getMorn", "getNight", "getWeather", "()Ljava/util/List;", "app_debug"})
public final class FortempModel {
    @androidx.room.PrimaryKey()
    private final int id = 0;
    private final double day = 0.0;
    private final double min = 0.0;
    private final double max = 0.0;
    private final double night = 0.0;
    private final double eve = 0.0;
    private final double morn = 0.0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<Weather> weather = null;
    
    public final int getId() {
        return 0;
    }
    
    public final double getDay() {
        return 0.0;
    }
    
    public final double getMin() {
        return 0.0;
    }
    
    public final double getMax() {
        return 0.0;
    }
    
    public final double getNight() {
        return 0.0;
    }
    
    public final double getEve() {
        return 0.0;
    }
    
    public final double getMorn() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<Weather> getWeather() {
        return null;
    }
    
    public FortempModel(int id, double day, double min, double max, double night, double eve, double morn, @org.jetbrains.annotations.NotNull()
    java.util.List<Weather> weather) {
        super();
    }
}