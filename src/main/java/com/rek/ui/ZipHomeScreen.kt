package com.rek.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Minimal Home screen Composable for the UI package.
 * Map the ZIP's Home screen layout (logo, Play buttons, Settings, Profile)
 * into this composable. Keep presentation only; wire navigation callbacks when integrating.
 */

@Composable
fun ZipHomeScreen(
    onPlayLocal: () -> Unit = {},
    onPlayOnline: () -> Unit = {},
    onHowToPlay: () -> Unit = {},
    onSettings: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    ZipTheme {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(androidx.compose.ui.graphics.Color.Transparent)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            // Logo / Title placeholder
            Card(modifier = Modifier.size(180.dp), elevation = CardDefaults.cardElevation(8.dp)) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "REK KHMER", modifier = Modifier.padding(8.dp))
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Play buttons
            Card(modifier = Modifier
                .padding(PaddingValues(vertical = 6.dp))
                .clickable { onPlayLocal() }) {
                Text("Play Local", modifier = Modifier.padding(12.dp))
            }

            Spacer(modifier = Modifier.height(8.dp))

            Card(modifier = Modifier
                .padding(PaddingValues(vertical = 6.dp))
                .clickable { onPlayOnline() }) {
                Text("Play Online", modifier = Modifier.padding(12.dp))
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Profile  •  How to Play  •  Settings")
        }
    }
}
