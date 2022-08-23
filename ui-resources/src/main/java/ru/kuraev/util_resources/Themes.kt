package ru.kuraev.util_resources

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColorScheme(
    primary = backgroundMain,
    background = backgroundMain,
    surface = backgroundMain,
)

private val LightColorPalette = lightColorScheme(
    primary = backgroundMain,
    background = backgroundMain,
    surface = backgroundMain
)

@Composable
fun JetComposeNavMultiModuleTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colorScheme = colors,
        typography = DefaultTypography,
        shapes = DefaultShape,
        content = content
    )
}