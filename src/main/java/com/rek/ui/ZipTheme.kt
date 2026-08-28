package com.rek.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Minimal ZipTheme: copy the colours / fonts from the supplied UI assets when available.

private val ZipLightColors: ColorScheme = lightColorScheme(
    primary = Color(0xFFB8860B), // AngkorGold placeholder
    onPrimary = Color.White,
    background = Color(0xFF0F0F10), // ObsidianDeep placeholder
    surface = Color(0xFF1B1B1C),
    onSurface = Color(0xFFEFEFEF)
)

private val ZipDarkColors: ColorScheme = darkColorScheme(
    primary = Color(0xFFB8860B),
    onPrimary = Color.Black,
    background = Color(0xFF0F0F10),
    surface = Color(0xFF1B1B1C),
    onSurface = Color(0xFFEFEFEF)
)

@Composable
fun ZipTheme(
    useDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors: ColorScheme = if (useDark) ZipDarkColors else ZipLightColors

    MaterialTheme(
        colorScheme = colors,
        typography = Typography(),
        content = content
    )
}
