package com.udhipe.cointracker.data.price.local

import com.udhipe.cointracker.data.PriceIndexDao
import com.udhipe.cointracker.data.PriceIndexLocalModel
import kotlinx.coroutines.flow.Flow

class PriceLocalDataSource(val priceIndexDao: PriceIndexDao): IPriceLocalDataSource {
    override suspend fun savePriceIndex(priceIndexLocalModel: PriceIndexLocalModel): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun updatePriceIndex(priceIndexLocalModel: PriceIndexLocalModel): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun getAllPriceIndex(): Flow<List<PriceIndexLocalModel>> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllPriceIndex(): Boolean {
        TODO("Not yet implemented")
    }
}