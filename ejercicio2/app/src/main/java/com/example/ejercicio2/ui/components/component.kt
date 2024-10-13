package com.example.ejercicio2.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.unit.dp

@Composable
fun MyButtonColor(text: String, backgroundColor: Color, modifier: Modifier = Modifier) {
    var currentText by remember { mutableStateOf(text) }
    var currentColor by remember { mutableStateOf(backgroundColor) }
    var currentTextColor by remember { mutableStateOf(Color.White) }

    Button(
        onClick = {
            currentText = "Botón pulsado"
            currentColor = Color.Gray
            currentTextColor = Color.Black
        },
        colors = ButtonDefaults.buttonColors(containerColor = currentColor),
        shape = RoundedCornerShape(4.dp),
        modifier = modifier.padding(8.dp)
    ) {
        Text(text = currentText, color = currentTextColor)
    }
}

@Composable
fun MyButtonText(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("Pulsa aquí") }

    Button(
        onClick = { text = "Botón pulsado" },
        modifier = modifier
    ) {
        Text(text = text)
    }
}