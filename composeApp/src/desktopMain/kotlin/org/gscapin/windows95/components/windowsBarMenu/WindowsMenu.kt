package org.gscapin.windows95.components.windowsBarMenu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.gscapin.windows95.components.BackgroundComponent
import org.gscapin.windows95.extensions.rotateVertically
import org.gscapin.windows95.ui.backgroundComponent
import org.gscapin.windows95.ui.windowsBarTextBackground
import org.jetbrains.compose.resources.painterResource
import windows95.composeapp.generated.resources.Res
import windows95.composeapp.generated.resources.ic_documents
import windows95.composeapp.generated.resources.ic_find
import windows95.composeapp.generated.resources.ic_help
import windows95.composeapp.generated.resources.ic_programs
import windows95.composeapp.generated.resources.ic_run
import windows95.composeapp.generated.resources.ic_settings
import windows95.composeapp.generated.resources.ic_shutdown

@Composable
fun WindowsMenu(showSubMenu: (Float?) -> Unit) {
    BackgroundComponent(Modifier.height(350.dp).background(backgroundComponent)) {
        Column {
            Row {
                Column {
                    Spacer(Modifier.weight(1f))
                    Box(
                        modifier = Modifier.padding(start = 4.dp, top = 4.dp).fillMaxHeight()
                            .background(
                                windowsBarTextBackground
                            ).padding(4.dp),
                        contentAlignment = Alignment.BottomStart
                    ) {
                        Text(
                            "Windows 95",
                            modifier = Modifier.rotateVertically(false),
                            fontSize = 42.sp
                        )
                    }
                }

                Column(Modifier.fillMaxHeight().width(200.dp)) {
                    WindowsMenuItem(
                        "Programs",
                        painter = painterResource(Res.drawable.ic_programs),
                        expandable = true
                    ) {
                        showSubMenu(it)
                    }
                    WindowsMenuItem(
                        "Documents",
                        painter = painterResource(Res.drawable.ic_documents),
                        expandable = true
                    ) {
                        showSubMenu(it)
                    }
                    WindowsMenuItem(
                        "Settings",
                        painter = painterResource(Res.drawable.ic_settings),
                        expandable = true
                    ) {
                        showSubMenu(it)
                    }
                    WindowsMenuItem(
                        "Find",
                        painter = painterResource(Res.drawable.ic_find),
                        expandable = true
                    ) {
                        showSubMenu(it)
                    }
                    WindowsMenuItem("Help", painter = painterResource(Res.drawable.ic_help)) {
                        showSubMenu(it)
                    }
                    WindowsMenuItem("Run..", painter = painterResource(Res.drawable.ic_run)) {
                        showSubMenu(it)
                    }
                    // DIVIDER
                    WindowsMenuItem(
                        "Shut Down..",
                        painter = painterResource(Res.drawable.ic_shutdown)
                    ) {
                        showSubMenu(it)
                    }
                }
            }
        }
    }
}