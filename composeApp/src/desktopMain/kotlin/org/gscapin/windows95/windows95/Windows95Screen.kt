package org.gscapin.windows95.windows95

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import org.gscapin.windows95.components.windowsBarMenu.WindowsBar
import org.gscapin.windows95.components.windowsBarMenu.WindowsBarMenuScreen
import org.gscapin.windows95.extensions.clickableWithoutRipple

@Composable
fun Windows95Screen() {

    var showWindowsMenu by remember { mutableStateOf(false) }


    Column {
        Box(Modifier.fillMaxWidth().weight(1f).clickableWithoutRipple { showWindowsMenu = false }) {
            WindowsBarMenuScreen(showWindowsMenu)
        }
        WindowsBar {
            showWindowsMenu = !showWindowsMenu
        }
    }
}