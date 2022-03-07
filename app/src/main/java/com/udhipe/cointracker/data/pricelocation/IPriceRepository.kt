package com.udhipe.cointracker.data.pricelocation

import com.udhipe.cointracker.domain.PriceIndex

interface IPriceRepository {
    suspend fun getCurrentPriceIndex(): List<PriceIndex>

    suspend fun saveCurrentPriceIndex(priceIndex: PriceIndex): Boolean

    suspend fun getTodayPriceIndex(): List<PriceIndex>

    suspend fun deletePreviousDayPriceIndex(): Boolean
}