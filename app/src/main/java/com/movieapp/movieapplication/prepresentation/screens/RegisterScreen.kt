package com.movieapp.movieapplication.prepresentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import com.movieapp.movieapplication.prepresentation.components.CustomTextField
import com.movieapp.movieapplication.prepresentation.components.PasswordTextField
import com.movieapp.movieapplication.prepresentation.ui.theme.BlackForBackground
import com.movieapp.movieapplication.prepresentation.ui.theme.GreyForFont

@Composable
fun RegisterScreen(navController: NavController) {
    val userNameState = remember { mutableStateOf("") }
    val emailState = remember { mutableStateOf("") }
    val passwordState = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BlackForBackground)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CustomText(
            text = "Create an Account",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(20.dp))

        CustomTextField(
            text = userNameState.value,
            onTextChange = { userNameState.value = it },
            placeholder = { CustomText(text = "Username", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = GreyForFont) },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        CustomTextField(
            text = emailState.value,
            onTextChange = { emailState.value = it },
            placeholder = { CustomText(text = "Email Address", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = GreyForFont) },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        PasswordTextField(
            text = passwordState.value,
            onTextChange = { passwordState.value = it },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        CustomButton(
            modifier = Modifier.fillMaxWidth().height(56.dp),
            text = "Create an Account",
            onClick = {navController.navigate("main")}
        )

        Spacer(Modifier.height(10.dp))

    }
}


@Preview(showBackground = true)
@Composable
fun PreviewRegisterScreen(){
    val userNameState = remember { mutableStateOf("") }
    val emailState = remember { mutableStateOf("") }
    val passwordState = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BlackForBackground)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CustomText(
            text = "Create an Account",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = userNameState.value,
            onValueChange = { userNameState.value = it },
            label = { Text(text = "User name", color = GreyForFont) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.DarkGray,
                unfocusedContainerColor = Color.DarkGray,
                disabledContainerColor = Color.DarkGray,
                focusedIndicatorColor = Color.Transparent,
                cursorColor = GreyForFont,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = emailState.value,
            onValueChange = { emailState.value = it },
            label = { Text(text = "Email Address", color = GreyForFont) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.DarkGray,
                unfocusedContainerColor = Color.DarkGray,
                disabledContainerColor = Color.DarkGray,
                focusedIndicatorColor = Color.Transparent,
                cursorColor = GreyForFont,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = passwordState.value,
            onValueChange = { passwordState.value = it },
            label = { Text(text = "Password", color = GreyForFont) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.DarkGray,
                unfocusedContainerColor = Color.DarkGray,
                disabledContainerColor = Color.DarkGray,
                focusedIndicatorColor = Color.Transparent,
                cursorColor = GreyForFont,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        CustomButton(text = "Create an Account", onClick = {}, modifier = Modifier.fillMaxWidth().height(56.dp))

        Spacer(Modifier.height(10.dp))

    }
}