package com.udhipe.cointracker.data.price.remote

data class PriceIndexNetworkModel(
    val time: TimeNetworkModel,
    val disclaimer: String,
    val chartName: String,
    val bpi: BpiNetWorkModel
)