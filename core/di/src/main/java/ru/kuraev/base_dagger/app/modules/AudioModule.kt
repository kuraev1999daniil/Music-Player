package ru.kuraev.base_dagger.app.modules

import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.kuraev.data.audio_scanner.AudioScanner
import ru.kuraev.data.audio.data.repositories.AudioRepositoryImpl
import ru.kuraev.data.audio.domain.repositories.AudioRepository
import javax.inject.Singleton

@Module
interface AudioModule {

    @Binds
    @Singleton
    fun bindAudioRepository(audioRepository: AudioRepositoryImpl): AudioRepository

    companion object {

        @Provides
        @Singleton
        fun provideAudioScanner(): AudioScanner = AudioScanner()
    }
}