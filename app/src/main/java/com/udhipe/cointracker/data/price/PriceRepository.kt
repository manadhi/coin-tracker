package com.udhipe.cointracker.data.price

import com.udhipe.cointracker.data.price.local.IPriceLocalDataSource
import com.udhipe.cointracker.data.price.remote.IPriceRemoteDataSource
import com.udhipe.cointracker.data.pricelocation.IPriceRepository
import com.udhipe.cointracker.domain.PriceIndex

class PriceRepository(val priceRemoteDataSource: IPriceRemoteDataSource, val priceLocalDataSource: IPriceLocalDataSource): IPriceRepository {
    override suspend fun getCurrentPriceIndex(): List<PriceIndex> {
        TODO("Not yet implemented")
    }

    override suspend fun saveCurrentPriceIndex(priceIndex: PriceIndex): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun getTodayPriceIndex(): List<PriceIndex> {
        TODO("Not yet implemented")
    }

    override suspend fun deletePreviousDayPriceIndex(): Boolean {
        TODO("Not yet implemented")
    }
}