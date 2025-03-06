package com.movieapp.movieapplication.prepresentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.movieapp.movieapplication.R
import com.movieapp.movieapplication.prepresentation.ui.theme.GrayForFont
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun PasswordTextField(
    text: String,
    onTextChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var passwordVisible by remember { mutableStateOf(false) }
    val interactionSource = remember { MutableInteractionSource() } // ✅ Отключаем Ripple

    CustomTextField(
        text = text,
        onTextChange = onTextChange,
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        placeholder = {
            CustomText(
                text = stringResource(R.string.password),
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = GrayForFont)
        },
        modifier = modifier,
        trailingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.password_visibility_icon),
                contentDescription = "Toggle Password Visibility",
                tint = Color.Gray,
                modifier = Modifier
                    .size(24.dp)
                    .clickable(
                        interactionSource = interactionSource,
                        indication = null,
                    ) { passwordVisible = !passwordVisible }
            )
        }
    )
}
