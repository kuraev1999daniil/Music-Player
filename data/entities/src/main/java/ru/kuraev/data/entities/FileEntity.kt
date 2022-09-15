package ru.kuraev.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = FileEntity.TABLE_NAME)
data class FileEntity(
    @[PrimaryKey ColumnInfo(name = COLUMN_ID)] val id: UUID = UUID.randomUUID(),
    @ColumnInfo(name = COLUMN_PATH) val path: String,
    @ColumnInfo(name = COLUMN_EXTENSION) val extension: String,
) {

    companion object {
        const val TABLE_NAME = "file"

        const val COLUMN_ID = "id"
        const val COLUMN_PATH = "path"
        const val COLUMN_EXTENSION = "extension"
    }
}
