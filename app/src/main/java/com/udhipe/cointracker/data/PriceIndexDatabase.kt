package com.udhipe.cointracker.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [PriceIndexLocalModel::class], version = 1, exportSchema = false)
abstract class PriceIndexDatabase : RoomDatabase() {
    abstract fun priceIndexDao(): PriceIndexDao

    companion object {
        @Volatile
        private var DBINSTANCE: PriceIndexDatabase? = null
        private const val DBNAME = "price_index_database"

        fun getDatabase(context: Context): PriceIndexDatabase {
            return DBINSTANCE ?: synchronized(this) {
                val dbInstance =
                    Room.databaseBuilder(context, PriceIndexDatabase::class.java, DBNAME)
                        .fallbackToDestructiveMigration()
                        .build()

                DBINSTANCE = dbInstance
                return dbInstance
            }
        }
    }
}