package ru.kuraev.data.converter

import androidx.room.TypeConverter
import java.util.*

class DatabaseConverter {

    @TypeConverter
    fun toUUID(uuid: String?): UUID? {
        return if (uuid != null) {
            UUID.fromString(uuid)
        } else {
            null
        }
    }

    @TypeConverter
    fun fromUUID(uuid: UUID?): String? {
        return uuid?.toString()
    }
}