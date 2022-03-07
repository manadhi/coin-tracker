package com.udhipe.cointracker.data.location

import com.udhipe.cointracker.data.location.remote.LocationNetworkModel
import com.udhipe.cointracker.data.pricelocation.ILocationRepository

class LocationRepository: ILocationRepository {
    override suspend fun getCurrentLocation(): LocationNetworkModel {
        TODO("Not yet implemented")
    }

    override suspend fun saveCurrentLocation(locationNetworkModel: LocationNetworkModel): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun deleteTodayLocation(): Boolean {
        TODO("Not yet implemented")
    }
}