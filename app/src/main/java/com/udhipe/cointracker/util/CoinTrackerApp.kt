package com.udhipe.cointracker.util

import android.app.Application
import com.udhipe.cointracker.data.PriceIndexDatabase
import com.udhipe.cointracker.data.price.PriceRepository
import com.udhipe.cointracker.data.price.local.IPriceLocalDataSource
import com.udhipe.cointracker.data.price.local.PriceLocalDataSource
import com.udhipe.cointracker.data.price.remote.IPriceRemoteDataSource
import com.udhipe.cointracker.data.price.remote.PriceIndexWebService
import com.udhipe.cointracker.data.price.remote.PriceRemoteDataSource
import com.udhipe.cointracker.data.pricelocation.IPriceRepository
import org.koin.dsl.module

val appModule = module {
    single { Network.client.create(PriceIndexWebService::class.java) }
    single<IPriceRemoteDataSource> { PriceRemoteDataSource(get()) }

    single { PriceIndexDatabase.getDatabase(get()).priceIndexDao() }
    single<IPriceLocalDataSource> { PriceLocalDataSource(get()) }

    single<IPriceRepository> { PriceRepository(priceLocalDataSource = get(), priceRemoteDataSource = get()) }

    
}

class CoinTrackerApp : Application() {

}