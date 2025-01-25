package org.gscapin.windows95

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import org.gscapin.windows95.splash.SplashScreen
import org.gscapin.windows95.ui.Windows95Typography
import org.gscapin.windows95.ui.background
import org.gscapin.windows95.windows95.Windows95Screen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme(
        typography = Windows95Typography()
    ) {
        var initializing: Boolean by remember { mutableStateOf(true) }

        Box(
            modifier = Modifier.fillMaxSize().background(background)
        ) {
            if (initializing) {
                SplashScreen {
                    initializing = false
                }
            } else {
                Windows95Screen()
            }

        }
    }
}