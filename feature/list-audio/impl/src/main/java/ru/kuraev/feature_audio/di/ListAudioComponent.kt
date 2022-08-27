package ru.kuraev.feature_audio.di

import dagger.Component
import ru.kuraev.base_dagger.app.AppComponent
import ru.kuraev.feature_audio.di.module.ListAudioModule
import ru.kuraev.feature_audio.presentation.screen.ListAudioVm

@ListAudioScope
@Component(dependencies = [AppComponent::class], modules = [ListAudioModule::class])
interface ListAudioComponent {

    val viewModel: ListAudioVm
}