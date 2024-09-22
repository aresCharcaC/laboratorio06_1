package com.example.lab06.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab06.ui.screens.FavoritesScreen
import com.example.lab06.ui.screens.HomeScreen
import com.example.lab06.ui.screens.SearchScreen
import com.example.lab06.ui.screens.UserProfileScreen
import com.example.lab06.ui.view.CounterFab

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val counterViewModel: CounterFab = viewModel()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController, counterViewModel) }
        composable("search") { SearchScreen(navController, counterViewModel) }
        composable("favorites") { FavoritesScreen(navController, counterViewModel) }
        composable("profile") { UserProfileScreen(navController, counterViewModel) }
    }
}