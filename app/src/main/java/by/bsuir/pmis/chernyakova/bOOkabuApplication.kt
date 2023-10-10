package by.bsuir.pmis.chernyakova

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class bOOkabuApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules()
        }
    }
}