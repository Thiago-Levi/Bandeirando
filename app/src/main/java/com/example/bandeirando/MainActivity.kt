package com.example.bandeirando

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.example.bandeirando.ui.theme.BandeirandoTheme
import com.example.bandeirando.views.FlagScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BandeirandoTheme {
                App()
            }
        }
    }
}

@Composable
fun App(){
    FlagScreen()
}


