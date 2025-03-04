package com.movieapp.movieapplication.prepresentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager

@Composable
fun ClearFocusContainer(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val focusManager = LocalFocusManager.current

    Box(
        modifier = modifier
            .clickable(
                indication = null, // Отключаем ripple эффект
                interactionSource = remember { MutableInteractionSource() } // Отключаем ripple-эффекты
            ) {
                focusManager.clearFocus()
            }
    ) {
        content()
    }
}
