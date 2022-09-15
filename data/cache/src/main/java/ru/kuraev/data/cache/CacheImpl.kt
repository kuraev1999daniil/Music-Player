package ru.kuraev.data.cache

import android.content.Context
import java.io.File
import java.util.*
import javax.inject.Inject

class CacheImpl @Inject constructor(
    private val context: Context
) : Cache {

    override fun saveFileBy(byteArray: ByteArray, type: CacheType): File {
        val root = File("${context.cacheDir}/${type.folderName}/")

        if (!root.exists()) {
            root.mkdirs()
        }

        val fileName = "${UUID.randomUUID()}.${type.extension}"

        val targetFile = File("${root.absolutePath}/$fileName")

        if (!targetFile.exists()) {
            targetFile.createNewFile()
        }

        targetFile.outputStream().use {
            it.write(byteArray)
        }

        return targetFile
    }
}