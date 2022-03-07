package com.udhipe.cointracker.domain

interface PriceLocationUseCase {
    suspend fun getTodayPriceIndex(): List<PriceIndex>
}