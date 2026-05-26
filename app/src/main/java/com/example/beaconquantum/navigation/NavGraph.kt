package com.example.beaconquantum.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.beaconquantum.core.navigation.Screen

@Composable
fun NavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        composable(Screen.Home.route) {
            Text("Экран Главная")
        }
        composable(Screen.Groups.route) {
            Text("Экран Группы")
        }
        composable(Screen.Practice.route) {
            Text("Экран Практика")
        }
        composable(Screen.Chats.route) {
            Text("Экран Чаты")
        }
        composable(Screen.Profile.route) {
            Text("Экран Профиль")
        }
    }
}
