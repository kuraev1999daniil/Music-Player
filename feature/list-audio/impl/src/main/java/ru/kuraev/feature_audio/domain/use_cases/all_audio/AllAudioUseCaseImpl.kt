package ru.kuraev.feature_audio.domain.use_cases.all_audio

import ru.kuraev.data.audio.domain.models.Audio
import ru.kuraev.data.audio.domain.repositories.AudioRepository
import javax.inject.Inject

class AllAudioUseCaseImpl @Inject constructor(
    private val audioRepository : AudioRepository
) : AllAudioUseCase {

    override suspend fun execute(): List<Audio> = audioRepository.scanAndSaveAudioData()
}