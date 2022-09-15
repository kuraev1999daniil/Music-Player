package ru.kuraev.feature_audio.domain.use_cases.all_audio

import kotlinx.coroutines.flow.Flow
import ru.kuraev.data.audio.domain.models.Audio

interface AllAudioUseCase {

    fun execute(): Flow<List<Audio>>
}