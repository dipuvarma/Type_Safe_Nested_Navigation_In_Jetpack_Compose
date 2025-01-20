package com.example.nestednavigation.presentation.navigation

import kotlinx.serialization.Serializable

//Routes
@Serializable
sealed class Graph { // Represents the root navigation graph
    @Serializable
    object AuthGraph : Graph() // Represents the auth section

    @Serializable
    object MainGraph : Graph() // Represents the main section

    @Serializable
    object HomeGraph : Graph()
}

// Routes inside nested graph
//For Auth
@Serializable
sealed class AuthGraph { // Nested navigation in the Auth section
    @Serializable
    object LoginScreen : AuthGraph()

    @Serializable
    object SignUpScreen : AuthGraph()

    @Serializable
    object ForgotScreen : AuthGraph()
}

// Routes inside nested graph
//For MainScreen
@Serializable
sealed class MainGraph { // Nested navigation in the Main section
    @Serializable
    object HomeScreen : MainGraph()

    @Serializable
    object AllBookScreen : MainGraph()

    @Serializable
    object SaveBookScreen : MainGraph()

    @Serializable
    object ProfileScreen : MainGraph()
}


@Serializable
sealed class HomeGraph {
    //ForRoutes inside HomeScreen
    @Serializable
    object AllBooksByCategoryScreen : HomeGraph()

    @Serializable
    object PdfViewScreen : HomeGraph()
}











