package com.aurora.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AuroraHomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize().background(
            Brush.linearGradient(listOf(Color(0xFF080B16), Color(0xFF14233B), Color(0xFF21143A)))
        ).padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("AURORA", color = Color(0xFF8DECF4), fontSize = 38.sp, fontWeight = FontWeight.Bold)
        Text("MEDIA PLAYER", color = Color.White, letterSpacing = 4.sp)
        Spacer(Modifier.height(18.dp))
        Text("EVERY SOUND HAS A UNIVERSE.", color = MaterialTheme.colorScheme.secondary)
        Spacer(Modifier.height(32.dp))
        Text("Foundation project", color = Color.White, fontSize = 20.sp)
        Text("Phase 1 · Architecture scaffold", color = Color.LightGray)
    }
}
