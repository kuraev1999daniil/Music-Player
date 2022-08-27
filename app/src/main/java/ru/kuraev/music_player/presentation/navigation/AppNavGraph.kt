package ru.kuraev.music_player.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.kuraev.base_dagger.app.AppComponent
import ru.kuraev.feature_audio.di.DaggerListAudioComponent
import ru.kuraev.feature_audio.presentation.screen.ListAudioScreen
import ru.kuraev.feature_main_more.presentation.screen.MainMoreScreen
import ru.kuraev.feature_main_video.presentation.screen.MainVideoScreen

@Composable
fun AppNavGraph(
    modifier: Modifier,
    appComponent: AppComponent,
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = "library_music") {
        composable("library_music") {
            ListAudioScreen(
                modifier = modifier,
                navController = navController,
                viewModel = DaggerListAudioComponent.builder()
                    .appComponent(appComponent)
                    .build()
                    .viewModel
            )
        }
        composable("library_video") {
            MainVideoScreen(modifier = modifier)
        }
        composable("dataset") {
            MainMoreScreen(modifier = modifier)
        }
    }
}