package com.example.nestednavigation.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.nestednavigation.presentation.navigation.AuthGraph.ForgotScreen
import com.example.nestednavigation.presentation.navigation.AuthGraph.SignUpScreen
import com.example.nestednavigation.presentation.navigation.MainGraph.HomeScreen

@Composable
fun LoginScreenUI(
    navController: NavController
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Text(text = "Login")
            Button(onClick = {
                navController.navigate(HomeScreen)
            }) {
                Text(text = "Login")
            }
            Button(onClick = {
                navController.navigate(SignUpScreen)
            }) {
                Text(text = "SignUp")
            }
            Button(onClick = {
                navController.navigate(ForgotScreen)
            }) {
                Text(text = "Forgot")
            }
        }
    }
}