package ru.kuraev.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = AudioEntity.TABLE_NAME)
data class AudioEntity(
    @[PrimaryKey ColumnInfo(name = COLUMN_ID)] val id: UUID = UUID.randomUUID(),
    @ColumnInfo(name = COLUMN_DATE) val date: String?,
    @ColumnInfo(name = COLUMN_ALBUM) val album: String?,
    @ColumnInfo(name = COLUMN_TITLE) val title: String?,
    @ColumnInfo(name = COLUMN_ARTIST) val artist: String?,
    @ColumnInfo(name = COLUMN_AUTHOR) val author: String?,
    @ColumnInfo(name = COLUMN_BITRATE) val bitrate: Long?,
    @ColumnInfo(name = COLUMN_IMAGE_ID) val imageId: UUID?,
    @ColumnInfo(name = COLUMN_DURATION) val duration: Long?,
    @ColumnInfo(name = COLUMN_COMPOSER) val composer: String?,
    @ColumnInfo(name = COLUMN_EXTENSION) val extension: String,
    @ColumnInfo(name = COLUMN_FOLDER_NAME) val folderName: String,
    @ColumnInfo(name = COLUMN_STORAGE_PATH) val storagePath: String,
    @ColumnInfo(name = COLUMN_ALBUMARTIST) val albumartist: String?,
    @ColumnInfo(name = COLUMN_COMPILATION) val compilation: String?,
) {

    companion object {
        const val TABLE_NAME = "audio"

        const val COLUMN_ID = "id"
        const val COLUMN_DATE = "date"
        const val COLUMN_ALBUM = "album"
        const val COLUMN_TITLE = "title"
        const val COLUMN_ARTIST = "artist"
        const val COLUMN_AUTHOR = "author"
        const val COLUMN_BITRATE = "bitrate"
        const val COLUMN_DURATION = "duration"
        const val COLUMN_COMPOSER = "composer"
        const val COLUMN_IMAGE_ID = "image_id"
        const val COLUMN_EXTENSION = "extension"
        const val COLUMN_FOLDER_NAME = "folder_name"
        const val COLUMN_ALBUMARTIST = "albumartist"
        const val COLUMN_COMPILATION = "compilation"
        const val COLUMN_STORAGE_PATH = "storage_path"
    }
}
