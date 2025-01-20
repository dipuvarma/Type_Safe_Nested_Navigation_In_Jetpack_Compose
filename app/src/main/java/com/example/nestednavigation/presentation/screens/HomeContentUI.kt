package com.example.nestednavigation.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.nestednavigation.presentation.navigation.HomeGraph.AllBooksByCategoryScreen

@Composable
fun HomeContentUI(
    navController: NavController,
    innerPadding: PaddingValues
) {
    // Actual UI for the "Home" tab
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ) {
        Text("Welcome to the Home Screen!")
        Button(onClick = { navController.navigate(AllBooksByCategoryScreen) }) {
            Text(text = "AllBooksByCategoryScreen")
        }
    }
}