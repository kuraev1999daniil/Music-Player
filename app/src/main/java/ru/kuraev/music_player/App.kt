package ru.kuraev.music_player

import android.app.Application
import ru.kuraev.music_player.di.DaggerAppComponent

class App : Application() {

    val appComponent = DaggerAppComponent.factory().create(this)
}