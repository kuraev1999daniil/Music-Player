package ru.kuraev.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.kuraev.data.entities.AudioEntity

@Database(
    version = 1,
    exportSchema = false,
    entities = [AudioEntity::class],
)
abstract class MediaPlayerDatabase : RoomDatabase() {

    companion object {

        const val DB_NAME = "media_player_database"
    }
}