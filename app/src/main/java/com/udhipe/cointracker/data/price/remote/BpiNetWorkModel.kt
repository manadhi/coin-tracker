package com.udhipe.cointracker.data.price.remote

import com.google.gson.annotations.SerializedName

data class BpiNetWorkModel(
    @SerializedName("USD")
    val usd: PriceNetworkModel,
    @SerializedName("GBP")
    val gbp: PriceNetworkModel,
    @SerializedName("EUR")
    val eur: PriceNetworkModel
)