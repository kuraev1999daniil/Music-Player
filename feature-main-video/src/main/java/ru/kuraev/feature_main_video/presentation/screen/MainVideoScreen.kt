package ru.kuraev.feature_main_video.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.TopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.kuraev.util_resources.R
import ru.kuraev.util_resources.backgroundMain
import ru.kuraev.util_resources.backgroundWhite

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun MainVideoScreen(modifier: Modifier) {
    Scaffold(
        modifier = modifier
            .fillMaxSize(),
        topBar = { TopBar() }
    ) { innerPaddingModifier ->
        Box(modifier = Modifier
            .padding(innerPaddingModifier)
            .background(backgroundWhite)
            .fillMaxSize()
        )
    }
}

@Composable
fun TopBar() {
    TopAppBar(
        elevation = 0.dp,
        modifier = Modifier.statusBarsPadding(),
        backgroundColor = backgroundMain
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(start = 16.dp)
                .fillMaxHeight()
        ) {
            Text(text = "Video Player", fontSize = 18.sp)
        }
    }
}