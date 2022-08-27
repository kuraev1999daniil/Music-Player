package ru.kuraev.music_player

import android.app.Application
import ru.kuraev.base_dagger.app.DaggerAppComponent

class App : Application() {

    val appComponent = DaggerAppComponent.factory().create(this)
}