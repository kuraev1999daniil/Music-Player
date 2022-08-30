package ru.kuraev.feature_audio.domain.use_cases.all_audio

import ru.kuraev.data.audio.domain.models.Audio

interface AllAudioUseCase {

    suspend fun execute(): List<Audio>
}