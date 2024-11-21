package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapplication.screens.FirstScreen
import com.example.myapplication.screens.SecondScreen
import com.example.myapplication.screens.WhatsAppApi

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppScreen.FirstScreen.route
    ) {
        composable(AppScreen.FirstScreen.route) {
            FirstScreen(navController)
        }

        composable(AppScreen.SecondScreen.route) {
            SecondScreen(navController)
        }
    }
}