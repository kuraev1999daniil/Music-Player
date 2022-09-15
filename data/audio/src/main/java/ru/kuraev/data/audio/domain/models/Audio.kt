package ru.kuraev.data.audio.domain.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Audio(
    val id: String,
    val date: String?,
    val title: String?,
    val album: String?,
    val bitrate: Long?,
    val duration: Long?,
    val artist: String?,
    val author: String?,
    val storagePath: String,
    val folderName: String,
    val composer: String?,
    val extension: String,
    val imagePath: String?,
    val albumartist: String?,
    val compilation: String?,
): Parcelable
