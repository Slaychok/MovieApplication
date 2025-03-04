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
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
import com.movieapp.movieapplication.prepresentation.ui.theme.MyYellow
import com.movieapp.movieapplication.prepresentation.ui.theme.White50

@Composable
fun LoginScreen(navController: NavController) {
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
        ) {
            Spacer(modifier = Modifier.weight(1f))

            CustomText(
                text = stringResource(R.string.login_now),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(30.dp))

            Box (contentAlignment = Alignment.Center){
                Text(
                    text = stringResource(R.string.login_text),
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
                placeholder =  { CustomText(
                    text = stringResource(R.string.email_address),
                    fontSize = 16.sp, fontWeight = FontWeight.Normal,
                    color = GreyForFont) },
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
                text = stringResource(R.string.login_now),
                onClick = {navController.navigate("main")}
            )

            Row(
                modifier = Modifier
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                CustomText(
                    text = stringResource(R.string.have_not_account),
                    fontSize = 16.sp,
                    color = GreyForFont,
                    fontWeight = FontWeight.Normal)

                TextButton(
                    onClick = { navController.navigate("register")} ,
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier.wrapContentWidth()
                ) {
                    CustomText(
                        text = stringResource(R.string.create_one),
                        fontSize = 16.sp,
                        color = MyYellow,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}