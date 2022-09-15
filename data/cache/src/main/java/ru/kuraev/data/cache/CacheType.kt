package ru.kuraev.data.cache

enum class CacheType {
    IMAGE;

    val folderName: String
        get() = when(this) {
            IMAGE -> {
                "image"
            }
        }

    val extension: String
        get() = when(this) {
            IMAGE -> {
                "jpeg"
            }
        }
}