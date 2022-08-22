package ru.kuraev.music_player.presentation.main

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import ru.kuraev.util_resources.R

enum class BottomTabs(
    @StringRes
    val title: Int,
    @DrawableRes
    val icon: Int,
    val route: String
) {

    MUSIC(R.string.tab_library_music, R.drawable.ic_library_music, "Library Music"),
    VIDEO(R.string.tab_library_video, R.drawable.ic_library_video, "Library Video"),
    MORE(R.string.tab_more, R.drawable.ic_more, "Dataset"),
}