package ru.kuraev.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ru.kuraev.data.entities.AudioEntity
import ru.kuraev.data.entities.FileEntity

@Dao
interface FileDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(entities: FileEntity)

    @Query("DELETE FROM ${FileEntity.TABLE_NAME}")
    fun deleteAll()
}