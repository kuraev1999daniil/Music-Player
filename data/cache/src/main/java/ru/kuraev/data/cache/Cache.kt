package ru.kuraev.data.cache

import java.io.File

interface Cache {

    fun saveFileBy(byteArray: ByteArray, type: CacheType): File
}