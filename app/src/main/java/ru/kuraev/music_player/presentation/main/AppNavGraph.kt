package ru.kuraev.music_player.presentation.main

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.kuraev.feature_audio.presentation.screen.MainAudioScreen
import ru.kuraev.feature_main_more.presentation.screen.MainMoreScreen
import ru.kuraev.feature_main_video.presentation.screen.MainVideoScreen

@Composable
fun AppNavGraph(
    modifier: Modifier,
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = "library_music") {
        composable("library_music") {
            MainAudioScreen(modifier = modifier)
        }
        composable("library_video") {
            MainVideoScreen(modifier = modifier)
        }
        composable("dataset") {
            MainMoreScreen(modifier = modifier)
        }
    }
}