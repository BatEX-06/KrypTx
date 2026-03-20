package com.example.kryptx

import android.app.Application
import com.example.kryptx.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KrypTxApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@KrypTxApplication)
            androidLogger()

            modules(appModule)
        }
    }
}