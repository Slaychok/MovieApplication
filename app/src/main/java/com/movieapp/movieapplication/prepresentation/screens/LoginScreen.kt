package com.movieapp.movieapplication.prepresentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.movieapp.movieapplication.prepresentation.components.CustomButton
import com.movieapp.movieapplication.prepresentation.components.CustomText

@Composable
fun LoginScreen(navController: NavController) {
    val emailState = remember { mutableStateOf("") }

    val passwordState = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Black1)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Login Now",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = emailState.value,
            onValueChange = { emailState.value = it },
            label = { Text(text = "Email Address", color = GreyFont) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.DarkGray,
                unfocusedContainerColor = Color.DarkGray,
                disabledContainerColor = Color.DarkGray,
                focusedIndicatorColor = Color.Transparent,
                cursorColor = GreyFont,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = passwordState.value,
            onValueChange = { passwordState.value = it },
            label = { Text(text = "Password", color = GreyFont) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.DarkGray,
                unfocusedContainerColor = Color.DarkGray,
                disabledContainerColor = Color.DarkGray,
                focusedIndicatorColor = Color.Transparent,
                cursorColor = GreyFont,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        CustomButton(text = "Login now", onClick = {navController.navigate("register")}, modifier = Modifier.fillMaxWidth())

        Spacer(Modifier.height(10.dp))

        Row(){
            CustomText(text = "Don't have account?", fontSize = 16.sp, color = GreyFont, fontWeight = FontWeight.Normal)

            Spacer(Modifier.padding(3.dp))

            CustomText(text = "Create now", fontSize = 16.sp, color = Yellow1, fontWeight = FontWeight.Normal)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    // Создаем состояния для email и password
    val emailState = remember { mutableStateOf("") }
    val passwordState = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Black1)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Login Now",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = emailState.value,
            onValueChange = { emailState.value = it },
            label = { Text(text = "Email Address", color = GreyFont) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.DarkGray,
                unfocusedContainerColor = Color.DarkGray,
                disabledContainerColor = Color.DarkGray,
                focusedIndicatorColor = Color.Transparent,
                cursorColor = GreyFont,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = passwordState.value,
            onValueChange = { passwordState.value = it },
            label = { Text(text = "Password", color = GreyFont) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.DarkGray,
                unfocusedContainerColor = Color.DarkGray,
                disabledContainerColor = Color.DarkGray,
                focusedIndicatorColor = Color.Transparent,
                cursorColor = GreyFont,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        CustomButton(text = "Login now", onClick = {}, modifier = Modifier.fillMaxWidth())

        Spacer(Modifier.height(10.dp))

        Row(){
            CustomText(text = "Don't have account?", fontSize = 16.sp, color = GreyFont, fontWeight = FontWeight.Normal)

            Spacer(Modifier.padding(3.dp))

            CustomText(text = "Create now", fontSize = 16.sp, color = Yellow1, fontWeight = FontWeight.Normal)
        }
    }
}