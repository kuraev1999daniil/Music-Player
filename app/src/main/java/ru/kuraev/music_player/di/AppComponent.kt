package ru.kuraev.music_player.di

import android.content.Context
import androidx.navigation.NavHostController
import dagger.BindsInstance
import dagger.Component
import ru.kuraev.music_player.di.modules.NavigationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [NavigationModule::class])
interface AppComponent {

    val context: Context

    val navHostController: NavHostController

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance context: Context): AppComponent
    }
}