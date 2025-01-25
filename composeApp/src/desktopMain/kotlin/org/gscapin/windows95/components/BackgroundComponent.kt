package org.gscapin.windows95.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import org.gscapin.windows95.ui.backgroundComponent

@Composable
fun BackgroundComponent(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Box(modifier.background(backgroundComponent).drawBehind {
        val strokeWidth = 1.5f
        val spacing = 1.5f
        val width = size.width
        val height = size.height

        drawLine(
            color = Color.White,
            start = Offset(0f, 0f),
            end = Offset(0f, height),
            strokeWidth = strokeWidth
        )

        drawLine(
            color = Color.White,
            start = Offset(spacing, 0f),
            end = Offset(0f, height),
            strokeWidth = strokeWidth
        )

        drawLine(
            color = Color.White,
            start = Offset(0f, spacing),
            end = Offset(width, 0f),
            strokeWidth = strokeWidth
        )

        drawLine(
            color = Color.White,
            start = Offset(0f, spacing),
            end = Offset(width, 0f),
            strokeWidth = strokeWidth
        )

        drawLine(
            color = Color.Black,
            start = Offset(width, 0f),
            end = Offset(width, height),
            strokeWidth = strokeWidth
        )

        drawLine(
            color = Color.DarkGray,
            start = Offset(width - spacing, 0f),
            end = Offset(width - spacing, height),
            strokeWidth = strokeWidth
        )

        drawLine(
            color = Color.DarkGray,
            start = Offset(0f, height),
            end = Offset(0f, height),
            strokeWidth = strokeWidth
        )

        drawLine(
            color = Color.DarkGray,
            start = Offset(0f, height - spacing),
            end = Offset(width, height - spacing),
            strokeWidth = strokeWidth
        )
    }) {
        content()
    }
}