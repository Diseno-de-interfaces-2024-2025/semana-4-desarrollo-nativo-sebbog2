package com.example.ejercicio2.ui.components
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun Button1(name: String, modifier: Modifier = Modifier){
    var showButtonDown by remember { mutableStateOf(false) }
    Column(modifier){
        Button(onClick = { showButtonDown=!showButtonDown }){
            Text("Click")
        }
        if(showButtonDown){
            OutlinedButton(onClick = {}) {
                Text("Outlined")
            }
        }
    }
}