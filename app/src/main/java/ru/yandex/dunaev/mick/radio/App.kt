package ru.yandex.dunaev.mick.radio

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import ru.yandex.dunaev.mick.radio.database.CatalogDatabase

class App: Application(){
    override fun onCreate() {
        super.onCreate()
        CatalogDatabase.init(applicationContext)
        AndroidThreeTen.init(this);
    }
}