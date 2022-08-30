package ru.kuraev.data.audio_scanner

import android.media.MediaMetadataRetriever
import java.io.File

class AudioRetriever {

    private val audioRetriever = MediaMetadataRetriever()

    fun setDataSource(targetFile: File): Boolean {
        try {
            audioRetriever.apply {
                this.setDataSource(targetFile.absolutePath)
            }

            if (!isAudio) {
                return false
            }

            return true
        } catch (e: RuntimeException) {
            return false
        }
    }

    val title: String?
        get() = decodeDataBy(MediaMetadataRetriever.METADATA_KEY_TITLE)

    val duration: Long?
        get() = decodeDataBy(MediaMetadataRetriever.METADATA_KEY_DURATION)?.toLong()

    val album: String?
        get() = decodeDataBy(MediaMetadataRetriever.METADATA_KEY_ALBUM)

    val artist: String?
        get() = decodeDataBy(MediaMetadataRetriever.METADATA_KEY_ARTIST)

    val author: String?
        get() = decodeDataBy(MediaMetadataRetriever.METADATA_KEY_AUTHOR)

    val date: String?
        get() = decodeDataBy(MediaMetadataRetriever.METADATA_KEY_DATE)

    val bitrate: Long?
        get() = decodeDataBy(MediaMetadataRetriever.METADATA_KEY_BITRATE)?.toLong()

    val albumartist: String?
        get() = decodeDataBy(MediaMetadataRetriever.METADATA_KEY_ALBUMARTIST)

    val composer: String?
        get() = decodeDataBy(MediaMetadataRetriever.METADATA_KEY_COMPOSER)

    val compilation: String?
        get() = decodeDataBy(MediaMetadataRetriever.METADATA_KEY_COMPILATION)

    val embeddedPicture: ByteArray?
        get() = audioRetriever.embeddedPicture

    private fun decodeDataBy(metadataKey: Int): String?
            = audioRetriever.extractMetadata(metadataKey)

    private val isAudio: Boolean
        get() = decodeDataBy(MediaMetadataRetriever.METADATA_KEY_HAS_AUDIO) == "yes"

    fun release() {
        audioRetriever.release()
    }

    fun close() {
        audioRetriever.close()
    }
}