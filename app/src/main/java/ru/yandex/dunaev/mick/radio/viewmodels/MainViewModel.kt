package ru.yandex.dunaev.mick.radio.viewmodels

import android.view.View
import androidx.lifecycle.ViewModel
import ru.yandex.dunaev.mick.radio.models.syncDb

class MainViewModel: ViewModel(){

    fun suncCatalog(view: View) = syncDb()

    override fun onCleared() {
        super.onCleared()
    }
}