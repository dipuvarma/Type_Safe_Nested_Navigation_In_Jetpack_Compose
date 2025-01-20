package com.example.nestednavigation.presentation.navigation.graph

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestednavigation.presentation.navigation.AuthGraph.ForgotScreen
import com.example.nestednavigation.presentation.navigation.AuthGraph.LoginScreen
import com.example.nestednavigation.presentation.navigation.AuthGraph.SignUpScreen
import com.example.nestednavigation.presentation.navigation.Graph
import com.example.nestednavigation.presentation.screens.LoginScreenUI


fun NavGraphBuilder.authNavGraph(navController: NavController) {
    navigation<Graph.AuthGraph>(startDestination = LoginScreen) {
        composable<LoginScreen> {
            LoginScreenUI(navController)
        }
        composable<SignUpScreen> {
            Text(text = "SignUp")
            Button(onClick = { navController.navigate(LoginScreen) }) {
                Text(text = "Login")
            }
        }
        composable<ForgotScreen> {
            Text(text = "Forgot")
            Button(onClick = { navController.navigate(LoginScreen) }) {
                Text(text = "Login")
            }
        }
    }
}