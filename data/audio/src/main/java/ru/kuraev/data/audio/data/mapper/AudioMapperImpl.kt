package ru.kuraev.data.audio.data.mapper

import ru.kuraev.data.audio.domain.models.Audio
import ru.kuraev.data.audio_scanner.AudioMetadata
import ru.kuraev.data.entities.AudioEntity
import ru.kuraev.data.entities.relations.AudioRelation
import java.io.File
import java.util.*
import javax.inject.Inject

class AudioMapperImpl @Inject constructor() : AudioMapper {

    override fun convertFrom(
        model: AudioMetadata, root: File, imageId: UUID?
    ): AudioEntity = AudioEntity(
        date = model.date,
        imageId = imageId,
        title = model.title,
        album = model.album,
        artist = model.artist,
        author = model.author,
        bitrate = model.bitrate,
        duration = model.duration,
        composer = model.composer,
        extension = model.extension,
        storagePath = root.absolutePath,
        albumartist = model.albumartist,
        compilation = model.compilation,
        folderName = root.nameWithoutExtension,
    )

    override fun convertFrom(model: AudioRelation): Audio = Audio(
        id = model.audio.id.toString(),
        date = model.audio.date,
        title = model.audio.title,
        album = model.audio.album,
        artist = model.audio.artist,
        author = model.audio.author,
        imagePath = model.file?.path,
        bitrate = model.audio.bitrate,
        duration = model.audio.duration,
        composer = model.audio.composer,
        extension = model.audio.extension,
        folderName = model.audio.folderName,
        storagePath = model.audio.storagePath,
        albumartist = model.audio.albumartist,
        compilation = model.audio.compilation,
    )
}