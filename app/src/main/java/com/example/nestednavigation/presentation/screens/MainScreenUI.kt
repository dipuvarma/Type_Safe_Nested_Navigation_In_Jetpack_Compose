package com.example.nestednavigation.presentation.screens

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nestednavigation.presentation.navigation.MainGraph.AllBookScreen
import com.example.nestednavigation.presentation.navigation.MainGraph.HomeScreen
import com.example.nestednavigation.presentation.navigation.MainGraph.ProfileScreen
import com.example.nestednavigation.presentation.navigation.MainGraph.SaveBookScreen
import com.example.nestednavigation.presentation.navigation.graph.BottomNavBar

@Composable
fun MainScreenUI(
    navController: NavController,
) {
    var homeNavController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavBar(homeNavController)
        }
    ) { paddingValues ->
        // Box containing NavHost for screen navigation
        NavHost(
            navController = homeNavController,
            startDestination = HomeScreen
        ) {
            composable<HomeScreen> {
                HomeContentUI(navController, paddingValues)
            }
            composable<AllBookScreen> {
                AllBookScreenUI(paddingValues)
            }
            composable<SaveBookScreen> {
                SaveBookScreenUI(paddingValues)
            }
            composable<ProfileScreen> {
                ProfileScreenUI(paddingValues)
            }

        }
    }
    }


//@Composable
//fun MainNavGraph(
//    navController: NavController,
//    innerPadding: PaddingValues,
//    homeNavController: NavHostController = rememberNavController(),
//    selectedItem: Int
//) {
//    NavHost(
//        navController = homeNavController,
//        startDestination = HomeScreen
//    ) {
//        when (selectedItem) {
//            0 -> composable<HomeScreen> {
//                HomeContentUI(navController, innerPadding)
//            }
//
//            1 -> composable<AllBookScreen> {
//                AllBookScreenUI(innerPadding)
//            }
//
//            2 -> composable<SaveBookScreen> {
//                SaveBookScreenUI(innerPadding)
//            }
//
//            3 -> composable<SaveBookScreen> {
//                ProfileScreenUI(innerPadding)
//            }
//        }
//    }
//}
