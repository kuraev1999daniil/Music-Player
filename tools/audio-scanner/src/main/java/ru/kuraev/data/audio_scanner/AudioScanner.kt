package ru.kuraev.data.audio_scanner

import android.os.Environment
import java.io.File

class AudioScanner {

    private val mediaMetadata = AudioMetadata()

    private val extensions = listOf("mp3", "wav")

    @Suppress("UNCHECKED_CAST")
    suspend fun getFilesBy(): HashMap<String, List<Audio>> {
        /**
         * <String, Audio> -> <path, audio_info>
         * */
        val songDirectories = hashMapOf<String, MutableList<Audio>>()

        val externalStorage = Environment.getExternalStorageDirectory()

        checkFile(externalStorage, externalStorage.absolutePath, songDirectories)

        mediaMetadata.close()

        return songDirectories as HashMap<String, List<Audio>>
    }

    private fun checkFile(
        targetFile: File,
        folderPath: String,
        songDirectories: HashMap<String, MutableList<Audio>>
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
                    Audio(
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