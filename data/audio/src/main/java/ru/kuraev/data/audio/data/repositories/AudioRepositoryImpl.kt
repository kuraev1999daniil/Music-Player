package ru.kuraev.data.audio.data.repositories

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import ru.kuraev.data.audio.domain.models.Audio
import ru.kuraev.data.audio.domain.repositories.AudioRepository
import ru.kuraev.data.audio_scanner.AudioScanner
import javax.inject.Inject

class AudioRepositoryImpl @Inject constructor(
    private val audioScanner: AudioScanner
) : AudioRepository {

    override suspend fun scanAndSaveAudioData(): List<Audio> = withContext(Dispatchers.IO) {
        val allAudios = mutableListOf<Audio>()

        audioScanner.getFilesBy().forEach {
            it.value.forEach { audio ->
                allAudios.add(
                    Audio(
                        title = audio.title,
                        duration = audio.duration,
                        album = audio.album,
                        artist = audio.artist,
                        author = audio.author,
                        date = audio.date,
                        bitrate = audio.bitrate,
                        albumartist = audio.albumartist,
                        composer = audio.composer,
                        compilation = audio.compilation,
                        extension = audio.extension,
                    )
                )
            }
        }

        allAudios
    }
}