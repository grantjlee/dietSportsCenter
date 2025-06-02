package com.example.dietsportscenter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.dietsportscenter.presentation.screens.home.HomeScreen
import com.example.dietsportscenter.ui.theme.DietSportsCenterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DietSportsCenterTheme {
                HomeScreen()
            }
        }
    }
}
