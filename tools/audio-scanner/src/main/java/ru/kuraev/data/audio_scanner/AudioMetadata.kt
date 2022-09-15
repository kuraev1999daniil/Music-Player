package ru.kuraev.data.audio_scanner

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AudioMetadata(
    val date: String?,
    val title: String?,
    val album: String?,
    val bitrate: Long?,
    val duration: Long?,
    val artist: String?,
    val author: String?,
    val composer: String?,
    val extension: String,
    val albumartist: String?,
    val compilation: String?,
    val embeddedPicture: ByteArray?,
): Parcelable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AudioMetadata

        if (title != other.title) return false
        if (duration != other.duration) return false
        if (album != other.album) return false
        if (artist != other.artist) return false
        if (author != other.author) return false
        if (date != other.date) return false
        if (bitrate != other.bitrate) return false
        if (albumartist != other.albumartist) return false
        if (composer != other.composer) return false
        if (compilation != other.compilation) return false
        if (embeddedPicture != null) {
            if (other.embeddedPicture == null) return false
            if (!embeddedPicture.contentEquals(other.embeddedPicture)) return false
        } else if (other.embeddedPicture != null) return false

        return true
    }

    override fun hashCode(): Int {
        var result = title?.hashCode() ?: 0
        result = 31 * result + (duration?.hashCode() ?: 0)
        result = 31 * result + (album?.hashCode() ?: 0)
        result = 31 * result + (artist?.hashCode() ?: 0)
        result = 31 * result + (author?.hashCode() ?: 0)
        result = 31 * result + (date?.hashCode() ?: 0)
        result = 31 * result + (bitrate?.hashCode() ?: 0)
        result = 31 * result + (albumartist?.hashCode() ?: 0)
        result = 31 * result + (composer?.hashCode() ?: 0)
        result = 31 * result + (compilation?.hashCode() ?: 0)
        result = 31 * result + (embeddedPicture?.contentHashCode() ?: 0)
        return result
    }
}
