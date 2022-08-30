package ru.kuraev.feature_audio.di

import dagger.Component
import ru.kuraev.base_dagger.app.AppComponent
import ru.kuraev.feature_audio.di.module.ListAudioUseCaseModule
import ru.kuraev.feature_audio.di.module.ListAudioVmModule
import ru.kuraev.feature_audio.presentation.screen.ListAudioVm

@ListAudioScope
@Component(
    dependencies = [
        AppComponent::class
    ],
    modules = [
        ListAudioVmModule::class,
        ListAudioUseCaseModule::class
    ]
)
interface ListAudioComponent {

    val viewModel: ListAudioVm
}