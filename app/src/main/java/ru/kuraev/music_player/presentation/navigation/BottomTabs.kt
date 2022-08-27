package ru.kuraev.music_player.presentation.navigation

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

    MUSIC(R.string.tab_library_music, R.drawable.ic_library_music, "library_music"),
    VIDEO(R.string.tab_library_video, R.drawable.ic_library_video, "library_video"),
    MORE(R.string.tab_more, R.drawable.ic_more, "dataset"),
}