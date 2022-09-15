package ru.kuraev.data.dao

import androidx.room.*
import ru.kuraev.data.entities.AudioEntity
import ru.kuraev.data.entities.relations.AudioRelation

@Dao
interface AudioDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(audios: List<AudioEntity>)

    @Transaction
    @Query("SELECT * FROM ${AudioEntity.TABLE_NAME}")
    fun getAllAudio(): List<AudioRelation>

    @Query("DELETE FROM ${AudioEntity.TABLE_NAME}")
    fun deleteAll()
}