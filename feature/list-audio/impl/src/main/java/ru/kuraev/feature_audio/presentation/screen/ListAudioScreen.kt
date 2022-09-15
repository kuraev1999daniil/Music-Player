package ru.kuraev.feature_audio.presentation.screen

import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.TopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import ru.kuraev.util_resources.R
import ru.kuraev.util_resources.backgroundMain
import ru.kuraev.util_resources.backgroundWhite

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun ListAudioScreen(viewModel: ListAudioVm, modifier: Modifier, navController: NavController) {
    Scaffold(
        modifier = modifier
            .fillMaxSize(),
        topBar = { TopBar(viewModel) }
    ) { innerPaddingModifier ->
        MainContent(
            innerPaddingModifier = innerPaddingModifier,
            viewModel = viewModel
        )
    }
}

@Composable
fun TopBar(viewModel: ListAudioVm) {
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
            Text(text = stringResource(id = R.string.app_name), fontSize = 18.sp)
        }
        Row(
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(end = 16.dp)
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            IconButton(onClick = {  }) {
                Image(
                    painter = painterResource(id = R.drawable.ic_palette),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(backgroundWhite)
                )
            }
            IconButton(onClick = { }) {
                Image(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(backgroundWhite)
                )
            }
        }
    }
}

@Composable
fun MainContent(
    innerPaddingModifier: PaddingValues,
    viewModel: ListAudioVm
) {
    Box(modifier = Modifier
        .padding(innerPaddingModifier)
        .background(backgroundWhite)
        .fillMaxSize()
    ) {
        val allAudio = viewModel.allAudio.collectAsState()
        LazyColumn(
            contentPadding = PaddingValues(
                start = 16.dp,
                top = 16.dp,
                end = 16.dp,
                bottom = 16.dp,
            ),
            modifier = Modifier.fillMaxSize()
        ) {
            items(allAudio.value) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Image(
                            bitmap = if (it.imagePath != null) {
                                BitmapFactory.decodeFile(it.imagePath).asImageBitmap()
                            } else {
                                ImageBitmap(32, 32)
                            },
                            contentDescription = null,
                            modifier = Modifier
                                .width(54.dp)
                                .height(54.dp),
                            contentScale = ContentScale.Crop
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 8.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = it.title ?: stringResource(id = R.string.unknown),
                                    color = Color.Black)
                                Text(
                                    text = it.artist ?: stringResource(id = R.string.unknown),
                                    color = Color.Black)
                            }
                            IconButton(
                                onClick = {

                                },
                                modifier = Modifier.wrapContentWidth()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_more_action),
                                    contentDescription = null
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}