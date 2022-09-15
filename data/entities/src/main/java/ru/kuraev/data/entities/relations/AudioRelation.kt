package ru.kuraev.data.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import ru.kuraev.data.entities.AudioEntity
import ru.kuraev.data.entities.FileEntity

data class AudioRelation(

    @Embedded
    val audio: AudioEntity,
    @Relation(parentColumn = AudioEntity.COLUMN_IMAGE_ID, entityColumn = FileEntity.COLUMN_ID)
    val file: FileEntity?,
)
