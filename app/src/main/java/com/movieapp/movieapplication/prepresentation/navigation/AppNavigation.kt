package com.movieapp.movieapplication.prepresentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.movieapp.movieapplication.prepresentation.screens.HomeScreen
import com.movieapp.movieapplication.prepresentation.screens.LoginScreen
import com.movieapp.movieapplication.prepresentation.screens.MainScreen
import com.movieapp.movieapplication.prepresentation.screens.ProfileScreen
import com.movieapp.movieapplication.prepresentation.screens.RegisterScreen
import com.movieapp.movieapplication.prepresentation.screens.SettingsScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController) }
        composable("register") { RegisterScreen(navController) }
        composable("main") { MainScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("profile") { ProfileScreen(navController) }
        composable("settings") { SettingsScreen(navController) }

    }
}

@Preview
@Composable
fun AppNavigationPreview(){
    AppNavigation()
}