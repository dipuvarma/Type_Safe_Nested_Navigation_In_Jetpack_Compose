package com.example.nestednavigation.presentation.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nestednavigation.presentation.navigation.Graph
import com.example.nestednavigation.presentation.navigation.MainGraph
import com.example.nestednavigation.presentation.screens.MainScreenUI

@Composable
fun RootNavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Graph.AuthGraph,
    ) {
        authNavGraph(navController)
        composable<MainGraph.HomeScreen>{
            MainScreenUI(navController)
        }
        homeNavGraph(navController)
    }
}