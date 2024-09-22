package com.example.lab06.ui.view

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterFab : ViewModel() {
    var count by mutableStateOf(0)
        private set

    fun incrementCount() {
        count++
    }
}