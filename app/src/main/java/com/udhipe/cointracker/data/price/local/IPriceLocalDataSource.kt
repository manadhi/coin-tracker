package com.udhipe.cointracker.data.price.local

import com.udhipe.cointracker.data.PriceIndexLocalModel
import kotlinx.coroutines.flow.Flow

interface IPriceLocalDataSource {
    suspend fun savePriceIndex(priceIndexLocalModel: PriceIndexLocalModel): Boolean

    suspend fun updatePriceIndex(priceIndexLocalModel: PriceIndexLocalModel): Boolean

    suspend fun getAllPriceIndex(): Flow<List<PriceIndexLocalModel>>

    suspend fun deleteAllPriceIndex(): Boolean
}