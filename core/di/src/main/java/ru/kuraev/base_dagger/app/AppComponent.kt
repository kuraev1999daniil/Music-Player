package ru.kuraev.base_dagger.app

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.kuraev.base_dagger.app.modules.AudioModule
import ru.kuraev.base_dagger.app.modules.CacheModule
import ru.kuraev.base_dagger.app.modules.DatabaseModule
import ru.kuraev.data.audio.domain.repositories.AudioRepository
import javax.inject.Singleton

@Singleton
@Component(modules = [DatabaseModule::class, AudioModule::class, CacheModule::class])
interface AppComponent {

    val context: Context

    val audioRepository: AudioRepository

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance context: Context): AppComponent
    }
}