package com.example.ejercicio1.ui.components

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.graphics.Color

@Composable
fun MyText(value: String, fontSize: TextUnit, color: Color, modifier: Modifier = Modifier){
    BasicText(
        text = value,
        modifier = modifier,
        style = TextStyle(
            fontSize = fontSize,
            color = color
        )
    )
}