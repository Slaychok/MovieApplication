package com.movieapp.movieapplication.prepresentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.movieapp.movieapplication.R
import com.movieapp.movieapplication.prepresentation.components.ClearFocusContainer
import com.movieapp.movieapplication.prepresentation.components.CustomButton
import com.movieapp.movieapplication.prepresentation.components.CustomText
import com.movieapp.movieapplication.prepresentation.components.CustomTextField
import com.movieapp.movieapplication.prepresentation.components.PasswordTextField
import com.movieapp.movieapplication.prepresentation.ui.theme.BlackForBackground
import com.movieapp.movieapplication.prepresentation.ui.theme.GreyForFont

@Composable
fun RegisterScreen(navController: NavController) {
    val userNameState = rememberSaveable { mutableStateOf("") }
    val emailState = rememberSaveable { mutableStateOf("") }
    val passwordState = rememberSaveable { mutableStateOf("") }

    ClearFocusContainer(
        modifier = Modifier
            .fillMaxSize()
            .background(BlackForBackground)
            .padding(16.dp),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Spacer(modifier = Modifier.weight(1f))

            CustomText(
                text = stringResource(R.string.create_account),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(20.dp))

            CustomTextField(
                text = userNameState.value,
                onTextChange = { userNameState.value = it },
                placeholder = { CustomText(
                    text = stringResource(R.string.username),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = GreyForFont) },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(20.dp))

            CustomTextField(
                text = emailState.value,
                onTextChange = { emailState.value = it },
                placeholder = { CustomText(
                    text = stringResource(R.string.email_address),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = GreyForFont) },
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
                text = stringResource(R.string.create_account),
                onClick = {navController.navigate("main")}
            )

            Spacer(modifier = Modifier.weight(1f))
        }
    }
}
