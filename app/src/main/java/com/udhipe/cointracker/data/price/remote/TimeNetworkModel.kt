package com.udhipe.cointracker.data.price.remote

import com.google.gson.annotations.SerializedName

data class TimeNetworkModel(
    val updated: String,
    val updatedISO: String,
    @SerializedName("updateduk")
    val updatedUK: String
)