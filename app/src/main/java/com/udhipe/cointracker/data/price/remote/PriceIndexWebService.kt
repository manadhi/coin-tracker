package com.udhipe.cointracker.data.price.remote

import retrofit2.Response
import retrofit2.http.GET

interface PriceIndexWebService {
    @GET("bpi/currentprice.json")
    suspend fun getCurrentPriceIndex(): Response<PriceIndexNetworkModel>
}