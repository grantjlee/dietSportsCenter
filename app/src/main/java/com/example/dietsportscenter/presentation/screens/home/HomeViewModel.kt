package com.example.dietsportscenter.presentation.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val _welcomeMessage = MutableStateFlow("Welcome to Diet Sports Center!")
    val welcomeMessage: StateFlow<String> = _welcomeMessage

    // Example of how you might update state:
    fun updateMessage(newMessage: String) {
        viewModelScope.launch {
            _welcomeMessage.emit(newMessage)
        }
    }
}
