package ru.kuraev.music_player.presentation.main.di

import dagger.Component
import ru.kuraev.base_dagger.app.AppComponent
import ru.kuraev.base_dagger.scope.ActivityScoped
import ru.kuraev.music_player.presentation.main.MainActivity
import ru.kuraev.music_player.presentation.main.di.modules.MainVmModule

@ActivityScoped
@Component(dependencies = [AppComponent::class], modules = [MainVmModule::class])
interface MainComponent {

    fun inject(screen: MainActivity)
}