package com.example.nestednavigation.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nestednavigation.presentation.navigation.HomeGraph

@Composable
fun AllBooksByCategoryScreenUI(
    navController: NavController
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(it)
        ) {
            Text(text = "AllBooksByCategoryScreen")
            Button(onClick = { navController.navigate(HomeGraph.PdfViewScreen) }) {
                Text(text = "PdfViewScreen")
            }
        }
    }
}