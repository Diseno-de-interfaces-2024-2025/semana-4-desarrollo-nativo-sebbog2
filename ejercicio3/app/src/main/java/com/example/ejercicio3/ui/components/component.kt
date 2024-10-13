package com.example.ejercicio2.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.input.PasswordVisualTransformation

@Composable
fun LoginScreen() {
    var username by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var loginStatus by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Usuario", style = MaterialTheme.typography.titleLarge)
        TextField(
            value = username,
            onValueChange = { username = it },
            placeholder = { Text("admin") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Contraseña", style = MaterialTheme.typography.titleLarge)
        TextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text("1234") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            loginStatus = if (username.text == "admin" && password.text == "1234") {
                "Usuario Correcto"
            } else {
                "Usuario Incorrecto"
            }
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Acceder")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = loginStatus,
            color = if (loginStatus == "Usuario Correcto") Color.Green else Color.Red,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}
