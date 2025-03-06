package com.movieapp.movieapplication.prepresentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.movieapp.movieapplication.prepresentation.navigation.bottomNavigation.BottomItem
import com.movieapp.movieapplication.prepresentation.navigation.bottomNavigation.BottomNavigationBar
import com.movieapp.movieapplication.prepresentation.ui.theme.BlackForBackground

@Composable
fun MainScreen(navController: NavController){
    val mainNavController = rememberNavController()

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(BlackForBackground),
        bottomBar = { BottomNavigationBar(mainNavController) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(BlackForBackground) // Дублируем фон, если `Scaffold` перекрывает
                .padding(paddingValues)
                .padding(16.dp), // Внутренние отступ
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            NavHost(
                navController = mainNavController,
                startDestination = BottomItem.HomeScreen.route,
                modifier = Modifier.padding(paddingValues)
            ) {
                composable(BottomItem.HomeScreen.route) { HomeScreen(navController) }
                composable(BottomItem.SearchScreen.route) { SearchScreen(navController) }
                composable(BottomItem.SettingsScreen.route) { SettingsScreen(navController) }
            }
        }
    }
}

@Preview
@Composable
fun MainScreenPreview(){

}