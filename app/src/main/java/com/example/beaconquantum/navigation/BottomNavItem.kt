package com.example.beaconquantum.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.beaconquantum.core.navigation.Screen

sealed class BottomNavItem(
    val title: String,
    val icon: ImageVector,
    val screen: Screen
) {
    object Home : BottomNavItem("Главная", Icons.Default.Home, Screen.Home)
    object Groups : BottomNavItem("Группы", Icons.Default.Groups, Screen.Groups)
    object Practice : BottomNavItem("Практика", Icons.Default.PlayArrow, Screen.Practice)
    object Chats : BottomNavItem("Чаты", Icons.Default.Chat, Screen.Chats)
    object Profile : BottomNavItem("Профиль", Icons.Default.Person, Screen.Profile)
}

val bottomNavItems = listOf(
    BottomNavItem.Home,
    BottomNavItem.Groups,
    BottomNavItem.Practice,
    BottomNavItem.Chats,
    BottomNavItem.Profile
)
