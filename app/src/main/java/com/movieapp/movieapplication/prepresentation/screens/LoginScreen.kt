package com.movieapp.movieapplication.prepresentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
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
import com.movieapp.movieapplication.prepresentation.ui.theme.MyYellow
import com.movieapp.movieapplication.prepresentation.ui.theme.White50

@Composable
fun LoginScreen(navController: NavController) {
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
            text = "Login Now",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(30.dp))

        Box (contentAlignment = Alignment.Center){
            Text(
                text = "Welcome back to PlayZone!" +
                        " Enter your email address and your password" +
                        " to enjoy the latest features of PlayZone",
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                color = White50
            )
        }

        Spacer(modifier = Modifier.height(40.dp))

        CustomTextField(
            text = emailState.value,
            onTextChange = {emailState.value = it},
            placeholder =  { CustomText(text = "Email Address", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = GreyForFont) },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        PasswordTextField(
            text = passwordState.value,
            onTextChange = {passwordState.value = it},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        CustomButton(
            modifier = Modifier.fillMaxWidth().height(56.dp),
            text = "Login now",
            onClick = {navController.navigate("main")}
        )

        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp), // Равномерное распределение
            verticalAlignment = Alignment.CenterVertically
        ){
            CustomText(
                text = "Don't have account?",
                fontSize = 16.sp,
                color = GreyForFont,
                fontWeight = FontWeight.Normal)

            TextButton(
                onClick = { navController.navigate("register")} ,
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier.wrapContentWidth()
                ) {
                CustomText(
                    text = "Create now",
                    fontSize = 16.sp,
                    color = MyYellow,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
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
        Text(
            text = "Login Now",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(30.dp))

        Box (contentAlignment = Alignment.Center){
            Text(
                text = "Welcome back to PlayZone!" +
                        " Enter your email address and your password" +
                        " to enjoy the latest features of PlayZone",
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                color = White50
            )
        }

        Spacer(modifier = Modifier.height(40.dp))

        CustomTextField(
            text = emailState.value,
            onTextChange = {emailState.value = it},
            placeholder =  { CustomText(text = "Email Address", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = GreyForFont) },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        PasswordTextField(
            text = passwordState.value,
            onTextChange = {passwordState.value = it},
            modifier = Modifier.fillMaxWidth()
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.End // Выравниваем текст вправо
        ) {
            CustomText(
                text = "Forgot password",
                fontSize = 12.sp,
                color = MyYellow,
                fontWeight = FontWeight.W400,
                textDecoration = TextDecoration.Underline
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        CustomButton(modifier = Modifier.fillMaxWidth().height(56.dp), text = "Login now", onClick = {})

        Spacer(Modifier.height(10.dp))

        Row(){
            CustomText(text = "Don't have account?", fontSize = 16.sp, color = GreyForFont, fontWeight = FontWeight.Normal)

            Spacer(Modifier.padding(5.dp))

            CustomText(text = "Create now", fontSize = 16.sp, color = MyYellow, fontWeight = FontWeight.Normal)
        }
    }
}