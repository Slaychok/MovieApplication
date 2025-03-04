package com.movieapp.movieapplication.prepresentation.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.movieapp.movieapplication.prepresentation.ui.theme.BlackForBackground
import com.movieapp.movieapplication.prepresentation.ui.theme.MyYellow

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = RoundedCornerShape(15.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MyYellow,
            contentColor = BlackForBackground
        )
    ) {
        CustomText(
            text = text,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal)
    }
}