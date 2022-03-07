package com.udhipe.cointracker.data.price.remote

class PriceRemoteDataSource(val priceIndexWebService: PriceIndexWebService): IPriceRemoteDataSource {
    override suspend fun getCurrentPriceIndex(): PriceIndexNetworkModel {
        TODO("Not yet implemented")
    }
}