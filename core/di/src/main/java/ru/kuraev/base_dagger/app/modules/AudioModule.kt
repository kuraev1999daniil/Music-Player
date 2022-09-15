package ru.kuraev.base_dagger.app.modules

import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.kuraev.data.audio.data.mapper.AudioMapper
import ru.kuraev.data.audio.data.mapper.AudioMapperImpl
import ru.kuraev.data.audio.data.repositories.AudioRepositoryImpl
import ru.kuraev.data.audio.domain.repositories.AudioRepository
import ru.kuraev.data.audio_scanner.AudioScanner
import javax.inject.Singleton

@Module(includes = [DatabaseModule::class, CacheModule::class])
interface AudioModule {

    @Binds
    @Singleton
    fun bindAudioRepository(audioRepository: AudioRepositoryImpl): AudioRepository

    @Binds
    @Singleton
    fun bindAudioMapper(audioMapper: AudioMapperImpl): AudioMapper

    companion object {

        @Provides
        @Singleton
        fun provideAudioScanner(): AudioScanner = AudioScanner()
    }
}