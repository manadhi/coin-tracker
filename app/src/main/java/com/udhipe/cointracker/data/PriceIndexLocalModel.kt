package com.udhipe.cointracker.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "price_table")
data class PriceIndexLocalModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "date_time", defaultValue = "")
    var dateTime: String,
    @ColumnInfo(name = "price_usd", defaultValue = "0")
    var priceUSD: Float,
    @ColumnInfo(name = "price_gbp", defaultValue = "0")
    var priceGBP: Float,
    @ColumnInfo(name = "price_eur", defaultValue = "0")
    var priceEUR: Float,
    var longitude: Float,
    var latitude: Float
)
