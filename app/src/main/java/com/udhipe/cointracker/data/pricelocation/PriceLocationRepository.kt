package com.udhipe.cointracker.data.pricelocation

import com.udhipe.cointracker.domain.IPriceLocationRepository
import com.udhipe.cointracker.domain.PriceIndex

class PriceLocationRepository(val priceRepository: IPriceRepository, val locationRepository: ILocationRepository): IPriceLocationRepository {
    override suspend fun getTodayPriceIndex(): List<PriceIndex> {
        TODO("Not yet implemented")
    }
}