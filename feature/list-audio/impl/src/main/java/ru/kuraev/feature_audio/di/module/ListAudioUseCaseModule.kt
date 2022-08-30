package ru.kuraev.feature_audio.di.module

import dagger.Binds
import dagger.Module
import ru.kuraev.feature_audio.di.ListAudioScope
import ru.kuraev.feature_audio.domain.use_cases.all_audio.AllAudioUseCase
import ru.kuraev.feature_audio.domain.use_cases.all_audio.AllAudioUseCaseImpl

@Module
interface ListAudioUseCaseModule {

    @Binds
    @ListAudioScope
    fun bindAllAudioUseCase(useCase: AllAudioUseCaseImpl): AllAudioUseCase
}