package ru.kuraev.feature_audio.di.module

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import ru.kuraev.feature_audio.di.ListAudioScope
import ru.kuraev.feature_audio.presentation.screen.ListAudioVm

@Module
interface ListAudioModule {

    @Binds
    @ListAudioScope
    fun getListAudioVm(viewModel: ListAudioVm): ViewModel
}