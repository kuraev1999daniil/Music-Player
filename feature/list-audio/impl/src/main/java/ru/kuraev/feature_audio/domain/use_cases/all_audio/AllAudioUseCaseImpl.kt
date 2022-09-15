package ru.kuraev.feature_audio.domain.use_cases.all_audio

import kotlinx.coroutines.flow.Flow
import ru.kuraev.data.audio.domain.models.Audio
import ru.kuraev.data.audio.domain.repositories.AudioRepository
import javax.inject.Inject

class AllAudioUseCaseImpl @Inject constructor(
    private val audioRepository : AudioRepository
) : AllAudioUseCase {

    override fun execute(): Flow<List<Audio>> = audioRepository.scanAudioStorage()
}