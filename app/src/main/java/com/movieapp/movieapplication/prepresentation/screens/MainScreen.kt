package com.movieapp.movieapplication.prepresentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.movieapp.movieapplication.prepresentation.ui.theme.BlackForBackground

@Composable
fun MainScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
            .background(BlackForBackground)
            .padding(16.dp)
    ) {

    }
}

@Preview
@Composable
fun MainScreenPreview(){

}