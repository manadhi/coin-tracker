package com.udhipe.cointracker.domain

import java.util.*

data class PriceIndex(
    val id: Int,
    val dateTime: Date,
    val price: Float,
    val longitude: Float,
    val latitude: Float
)