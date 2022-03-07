package com.udhipe.cointracker.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

interface PriceIndexDao {
    @Query("SELECT * FROM price_table ORDER BY id DESC")
    suspend fun getAllPriceIndex(): Flow<List<PriceIndexLocalModel>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertPriceIndex(priceIndexLocalModel: PriceIndexLocalModel)

    @Update(entity = PriceIndexLocalModel::class)
    suspend fun updatePriceIndex(locationLocalModel: LocatioLocalModel)

    @Query("DELETE FROM price_table")
    suspend fun deleteAll()
}