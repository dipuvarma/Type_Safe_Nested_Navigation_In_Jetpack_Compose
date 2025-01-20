package com.example.nestednavigation.presentation.navigation.bottomBarNav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Book
import androidx.compose.material.icons.outlined.Bookmark
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.nestednavigation.presentation.navigation.MainGraph.AllBookScreen
import com.example.nestednavigation.presentation.navigation.MainGraph.HomeScreen
import com.example.nestednavigation.presentation.navigation.MainGraph.ProfileScreen
import com.example.nestednavigation.presentation.navigation.MainGraph.SaveBookScreen

data class NavigationItem(
    val title: String,
    val route: Any,
    val selectedIcon: ImageVector,
    val unSelectedIcon: ImageVector
)


val navigationItemList = listOf (
    NavigationItem(
        title = "Home",
        route = HomeScreen,
        selectedIcon = Icons.Filled.Home,
        unSelectedIcon = Icons.Outlined.Home
    ),
    NavigationItem(
        title = "Books",
        route = AllBookScreen,
        selectedIcon = Icons.Filled.Book,
        unSelectedIcon = Icons.Outlined.Book
    ),
    NavigationItem(
        title = "Save",
        route = SaveBookScreen,
        selectedIcon = Icons.Filled.Bookmark,
        unSelectedIcon = Icons.Outlined.Bookmark
    ),
    NavigationItem(
        title = "Profile",
        route = ProfileScreen,
        selectedIcon = Icons.Filled.Person,
        unSelectedIcon = Icons.Outlined.Person
    )
)

