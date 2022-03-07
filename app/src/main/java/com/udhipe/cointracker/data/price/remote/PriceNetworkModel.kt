package com.udhipe.cointracker.data.price.remote

import com.google.gson.annotations.SerializedName

data class PriceNetworkModel(
    val code: String,
    val symbol: String,
    val rate: String,
    val description: String,
    @SerializedName("rate_float")
    val rateFloat: Float
)