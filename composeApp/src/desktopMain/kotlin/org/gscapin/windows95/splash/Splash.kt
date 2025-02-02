package org.gscapin.windows95.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import org.gscapin.windows95.helper.SoundManager
import org.jetbrains.compose.resources.painterResource
import windows95.composeapp.generated.resources.Res
import windows95.composeapp.generated.resources.splash

@Composable
fun SplashScreen(onSoundFinished: () -> Unit) {

    val soundManager = remember { SoundManager() }

    LaunchedEffect(Unit){
        soundManager.playSplashSound {
            onSoundFinished()
        }
    }


    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(Res.drawable.splash),
        contentDescription = "Windows 95 Splash",
        contentScale = ContentScale.Crop
    )
}