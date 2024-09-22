package com.example.lab06.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.lab06.ui.components.CustomScaffold
import com.example.lab06.ui.view.CounterFab


@Composable
fun SearchScreen(navController: NavController, counterViewModel: CounterFab) {
    CustomScaffold(
        navController = navController,
        counterViewModel = counterViewModel
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            Text(
                "Search Fill",
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}

@Composable
fun FavoritesScreen(navController: NavController, counterViewModel: CounterFab) {
    CustomScaffold(
        navController = navController,
        counterViewModel = counterViewModel
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            Text(
                "Favorites Fill",
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}