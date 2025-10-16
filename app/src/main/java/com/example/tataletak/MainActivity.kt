package com.example.tataletak

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.tataletak.ui.theme.TataletakTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TataletakTheme { // ✅ nama fungsi theme harus sama persis
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    IniLatetakBoxColumnRow(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}