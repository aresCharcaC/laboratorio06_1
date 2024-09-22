package com.example.lab06.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.lab06.ui.view.CounterFab

@Composable
fun CustomScaffold(
    navController: NavController,
    counterViewModel: CounterFab,
    floatingActionButton: @Composable () -> Unit = {},
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        topBar = { CustomTopBar(navController) },
        bottomBar = { CustomBottomBar(navController, counterViewModel.count) },
        floatingActionButton = floatingActionButton,
        content = content
    )
}