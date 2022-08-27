package ru.kuraev.music_player.presentation.main

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import ru.kuraev.music_player.presentation.base.BaseActivity
import ru.kuraev.music_player.presentation.main.di.DaggerMainComponent

class MainActivity : BaseActivity<MainActivityVm>(MainActivityVm::class) {

    override fun buildDagger() {
        DaggerMainComponent.builder()
            .appComponent(appComponent)
            .build()
            .inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            MainContent(appComponent = appComponent)
        }
    }
}