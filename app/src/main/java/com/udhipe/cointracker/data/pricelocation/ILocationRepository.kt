package com.udhipe.cointracker.data.pricelocation

import com.udhipe.cointracker.data.location.remote.LocationNetworkModel

interface ILocationRepository {
    suspend fun getCurrentLocation(): LocationNetworkModel

    suspend fun saveCurrentLocation(locationNetworkModel: LocationNetworkModel): Boolean

    suspend fun deleteTodayLocation(): Boolean
}