package com.example.lab06.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable

@Composable
fun CustomFAB(onFabClick: () -> Unit) {
    FloatingActionButton(onClick = onFabClick) {
        Icon(Icons.Filled.Add, contentDescription = "Add")
    }
}