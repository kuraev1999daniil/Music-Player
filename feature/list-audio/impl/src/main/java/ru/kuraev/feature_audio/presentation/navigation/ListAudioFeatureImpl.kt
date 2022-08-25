package ru.kuraev.feature_audio.presentation.navigation

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import ru.kuraev.api.ListAudioFeatureApi
import ru.kuraev.feature_audio.presentation.screen.ListAudioScreen

class ListAudioFeatureImpl : ListAudioFeatureApi {

    private val baseRoute = "list_audio"

    override fun route(): String = baseRoute

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(baseRoute) {
            ListAudioScreen(modifier = modifier, navController = navController)
        }
    }
}