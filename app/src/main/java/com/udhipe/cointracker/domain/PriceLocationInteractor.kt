package com.udhipe.cointracker.domain

class PriceLocationInteractor(private val pricelocationRepository: IPriceLocationRepository): PriceLocationUseCase {
    override suspend fun getTodayPriceIndex(): List<PriceIndex> {
        return pricelocationRepository.getTodayPriceIndex()
    }
}