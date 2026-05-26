package com.example.beaconquantum.core.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Groups : Screen("groups")
    object Practice : Screen("practice")
    object Chats : Screen("chats")
    object Profile : Screen("profile")
}
