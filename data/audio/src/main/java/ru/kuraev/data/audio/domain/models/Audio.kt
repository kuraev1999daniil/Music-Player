package ru.kuraev.data.audio.domain.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Audio(
    val title: String?,
    val duration: Long?,
    val album: String?,
    val artist: String?,
    val author: String?,
    val date: String?,
    val bitrate: Long?,
    val albumartist: String?,
    val composer: String?,
    val compilation: String?,
    val extension: String,
): Parcelable
