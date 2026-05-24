package com.example.masakannusantara_uts.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.masakannusantara_uts.screen.*
import com.example.masakannusantara_uts.screen.EditProfileScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {

        composable("home") {
            HomeScreen(navController)
        }

        composable("menu") {
            MenuScreen(navController)
        }

        composable("detail") {
            DetailMenuScreen(navController)
        }

        composable("profile") {
            ProfileScreen(navController)
        }

        composable("editProfile") {
            EditProfileScreen(navController)
        }
    }
}