package com.movieapp.movieapplication.prepresentation.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import com.movieapp.movieapplication.prepresentation.ui.theme.BlackForBackground
import com.movieapp.movieapplication.prepresentation.ui.theme.SkModernist

@Composable
fun CustomText(
    text: String,
    fontSize: TextUnit,
    color: Color = BlackForBackground,
    fontWeight: FontWeight,
    textDecoration: TextDecoration? = null,
) {
    Text(
        text = text,
        fontSize = fontSize,
        fontWeight = fontWeight,
        style = TextStyle(
            fontFamily = SkModernist,
            fontSize = fontSize,
            fontWeight = fontWeight,
            color = color,
            textDecoration = textDecoration
        ),
    )
}