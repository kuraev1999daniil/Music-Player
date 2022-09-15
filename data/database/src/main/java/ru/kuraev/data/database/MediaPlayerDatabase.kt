package ru.kuraev.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ru.kuraev.data.converter.DatabaseConverter
import ru.kuraev.data.dao.AudioDao
import ru.kuraev.data.dao.FileDao
import ru.kuraev.data.entities.AudioEntity
import ru.kuraev.data.entities.FileEntity

@TypeConverters(
    value = [
        DatabaseConverter::class
    ]
)
@Database(
    version = 1,
    exportSchema = false,
    entities = [AudioEntity::class, FileEntity::class],
)
abstract class MediaPlayerDatabase : RoomDatabase() {

    abstract fun audioDao(): AudioDao

    abstract fun fileDao(): FileDao

    companion object {

        const val DB_NAME = "media_player_database"
    }
}