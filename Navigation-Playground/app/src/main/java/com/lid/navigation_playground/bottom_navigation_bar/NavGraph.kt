package com.lid.navigation_playground.bottom_navigation_bar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.lid.navigation_playground.FourthScreen
import com.lid.navigation_playground.HomeScreen
import com.lid.navigation_playground.SecondScreen
import com.lid.navigation_playground.ThirdScreen

sealed class Screen(val route: String, val destination: String, val icon: ImageVector) {
    object Home : Screen("home", "Home", Icons.Default.Home)
    object Second : Screen("second", " Second", Icons.Default.Phone)
    object Third : Screen("third", "Third", Icons.Default.Email)
    object Fourth : Screen("fourth", "Fourth", Icons.Default.AccountCircle)
}

@Composable
fun NavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Screen.Home.route) {

        composable(Screen.Home.route) {
            HomeScreen()
        }

        composable(Screen.Second.route) {
            SecondScreen()
        }

        composable(Screen.Third.route) {
            ThirdScreen()
        }

        composable(Screen.Fourth.route) {
            FourthScreen()
        }
    }
}