package org.gscapin.windows95

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import org.gscapin.windows95.splash.SplashScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        var initializing: Boolean by remember { mutableStateOf(true) }

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            if (initializing) {
                SplashScreen {
                    initializing = false
                }
            } else {
                // Windows95
                Text("Hola")
            }

        }
    }
}