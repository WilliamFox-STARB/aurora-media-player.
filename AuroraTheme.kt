package com.aurora.core.design

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val AuroraColors = darkColorScheme(
    primary = Color(0xFF67E8F9),
    secondary = Color(0xFFB49CFF),
    tertiary = Color(0xFF5EEAD4),
    background = Color(0xFF080B16),
    surface = Color(0xFF11172A)
)

@Composable
fun AuroraTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = AuroraColors, content = content)
}
