package com.udhipe.cointracker.domain

interface IPriceLocationRepository {
    suspend fun getTodayPriceIndex(): List<PriceIndex>
}