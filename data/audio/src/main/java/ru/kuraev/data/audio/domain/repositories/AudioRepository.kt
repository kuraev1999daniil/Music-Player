package ru.kuraev.data.audio.domain.repositories

import kotlinx.coroutines.flow.Flow
import ru.kuraev.data.audio.domain.models.Audio

interface AudioRepository {

    fun scanAudioStorage(): Flow<List<Audio>>
}