package com.udhipe.cointracker.data.price.remote

interface IPriceRemoteDataSource {
    suspend fun getCurrentPriceIndex(): PriceIndexNetworkModel
}