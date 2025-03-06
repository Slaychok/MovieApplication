package com.movieapp.movieapplication.prepresentation.navigation.bottomNavigation

import androidx.annotation.DrawableRes
import com.movieapp.movieapplication.R

sealed class BottomItem(@DrawableRes val IconId: Int, val route: String){
    data object HomeScreen: BottomItem(R.drawable.home, "home")
    data object SearchScreen: BottomItem(R.drawable.search, "search")
    data object SettingsScreen: BottomItem(R.drawable.settings, "settings")
}
