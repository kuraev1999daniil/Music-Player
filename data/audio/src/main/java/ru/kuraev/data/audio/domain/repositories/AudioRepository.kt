package ru.kuraev.data.audio.domain.repositories

import ru.kuraev.data.audio.domain.models.Audio

interface AudioRepository {

    suspend fun scanAndSaveAudioData(): List<Audio>
}