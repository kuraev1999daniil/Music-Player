package ru.kuraev.data.audio_scanner

import android.os.Environment
import java.io.File

class AudioScanner {

    private val mediaMetadata = AudioRetriever()

    private val extensions = listOf("mp3", "wav")

    @Suppress("UNCHECKED_CAST")
    fun getAudioStorage(): HashMap<String, List<AudioMetadata>> {
        /**
         * <String, Audio> -> <path, audio_info>
         * */
        val songDirectories = hashMapOf<String, MutableList<AudioMetadata>>()

        val externalStorage = Environment.getExternalStorageDirectory()

        checkFile(externalStorage, externalStorage.absolutePath, songDirectories)

        mediaMetadata.close()

        return songDirectories as HashMap<String, List<AudioMetadata>>
    }

    private fun checkFile(
        targetFile: File,
        folderPath: String,
        songDirectories: HashMap<String, MutableList<AudioMetadata>>
    ) {
        if (targetFile.isDirectory) {
            targetFile.listFiles()?.forEach {
                checkFile(it, targetFile.absolutePath, songDirectories)
            }
        } else if (extensions.contains(targetFile.extension)) {
            if (mediaMetadata.setDataSource(targetFile)) {
                if (!songDirectories.containsKey(folderPath)) {
                    songDirectories[folderPath] = mutableListOf()
                }
                songDirectories[folderPath]?.add(
                    AudioMetadata(
                        title = mediaMetadata.title,
                        duration = mediaMetadata.duration,
                        album = mediaMetadata.album,
                        artist = mediaMetadata.artist,
                        author = mediaMetadata.author,
                        date = mediaMetadata.date,
                        bitrate = mediaMetadata.bitrate,
                        albumartist = mediaMetadata.albumartist,
                        composer = mediaMetadata.composer,
                        compilation = mediaMetadata.compilation,
                        embeddedPicture = mediaMetadata.embeddedPicture,
                        extension = targetFile.extension,
                    )
                )
            }
        }
    }
}