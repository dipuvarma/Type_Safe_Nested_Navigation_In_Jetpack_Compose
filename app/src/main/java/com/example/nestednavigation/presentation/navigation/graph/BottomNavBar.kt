package com.example.nestednavigation.presentation.navigation.graph

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nestednavigation.presentation.navigation.bottomBarNav.navigationItemList

@Composable
fun BottomNavBar(
    navController: NavController
) {
    var selectedItem by remember { mutableIntStateOf(0) }
    NavigationBar(modifier = Modifier.height(56.dp)) {
        navigationItemList.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        imageVector = if (selectedItem == index) item.selectedIcon else item.unSelectedIcon,
                        contentDescription = item.title
                    )
                }
            )
        }
    }
}



