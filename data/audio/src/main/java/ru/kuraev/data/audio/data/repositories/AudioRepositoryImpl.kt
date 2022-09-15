package ru.kuraev.data.audio.data.repositories

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ru.kuraev.data.audio.data.mapper.AudioMapper
import ru.kuraev.data.audio.domain.models.Audio
import ru.kuraev.data.audio.domain.repositories.AudioRepository
import ru.kuraev.data.audio_scanner.AudioScanner
import ru.kuraev.data.cache.Cache
import ru.kuraev.data.cache.CacheType
import ru.kuraev.data.dao.AudioDao
import ru.kuraev.data.dao.FileDao
import ru.kuraev.data.entities.AudioEntity
import ru.kuraev.data.entities.FileEntity
import java.io.File
import java.util.*
import javax.inject.Inject

class AudioRepositoryImpl @Inject constructor(
    private val scanner: AudioScanner,
    private val audioDao: AudioDao,
    private val fileDao: FileDao,
    private val cache: Cache,
    private val mapper: AudioMapper,
) : AudioRepository {

    override fun scanAudioStorage(): Flow<List<Audio>> = flow {

        audioDao.deleteAll()
        fileDao.deleteAll()

        val audio = scanner.getAudioStorage()
        val albumImages = hashMapOf<String, UUID?>()
        val audioEntities = mutableListOf<AudioEntity>()
        audio.forEach { byDirectory ->
            byDirectory.value.forEach { audio ->
                val album = audio.album
                if (album != null && !albumImages.containsKey(audio.album)) {
                    val embeddedPicture = audio.embeddedPicture
                    albumImages[album] = if (embeddedPicture != null) {
                        val imageFile = cache.saveFileBy(embeddedPicture, CacheType.IMAGE)
                        val fileEntity = FileEntity(
                            path = imageFile.absolutePath,
                            extension = audio.extension,
                        )
                        fileDao.insert(fileEntity)
                        fileEntity.id
                    } else {
                        null
                    }
                }
                audioEntities.add(
                    mapper.convertFrom(audio, File(byDirectory.key), albumImages[album])
                )
            }
        }

        audioDao.insert(audioEntities)

        emit(audioDao.getAllAudio().map { mapper.convertFrom(it) })
    }
}