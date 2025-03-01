package com.movieapp.movieapplication.prepresentation.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit

@Composable
fun CustomText(
    text: String,
    fontSize: TextUnit, // Позволяет задавать размер текста
    color: Color = Black1, // Цвет текста (по умолчанию черный)
    fontWeight: FontWeight // Жирность текста
) {
    Text(
        text = text,
        fontSize = fontSize,
        fontWeight = fontWeight,
        style = TextStyle(
            fontFamily = SkModernist,
            fontSize = fontSize,
            fontWeight = fontWeight,
            color = color
        )
    )
}


@Preview
@Composable
fun CustomTextPreview(){

}