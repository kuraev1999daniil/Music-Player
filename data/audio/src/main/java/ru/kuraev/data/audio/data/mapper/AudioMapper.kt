package ru.kuraev.data.audio.data.mapper

import ru.kuraev.data.audio.domain.models.Audio
import ru.kuraev.data.audio_scanner.AudioMetadata
import ru.kuraev.data.entities.AudioEntity
import ru.kuraev.data.entities.relations.AudioRelation
import java.io.File
import java.util.*

interface AudioMapper {

    fun convertFrom(model: AudioMetadata, root: File, imageId: UUID?): AudioEntity

    fun convertFrom(model: AudioRelation): Audio
}