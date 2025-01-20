package com.example.nestednavigation.presentation.navigation.graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestednavigation.presentation.navigation.Graph
import com.example.nestednavigation.presentation.navigation.HomeGraph.AllBooksByCategoryScreen
import com.example.nestednavigation.presentation.navigation.HomeGraph.PdfViewScreen
import com.example.nestednavigation.presentation.screens.AllBooksByCategoryScreenUI
import com.example.nestednavigation.presentation.screens.PdfViewScreenUI

fun NavGraphBuilder.homeNavGraph(navController: NavController) {

    navigation<Graph.HomeGraph>(startDestination = AllBooksByCategoryScreen) {
        composable<AllBooksByCategoryScreen> {
            AllBooksByCategoryScreenUI(
                navController
            )
        }
        composable<PdfViewScreen> {
            PdfViewScreenUI()
        }
    }
}