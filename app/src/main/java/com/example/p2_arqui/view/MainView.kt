package com.example.p2_arqui.view

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainView(navController: NavController) {
    // Obtén el contexto actual
    val context = LocalContext.current

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Bienvenido a la aplicación Personal Trainer")

        // Botón de Cliente
        Button(onClick = {
            // Navega a ClienteView cuando se selecciona Cliente
            navController.navigate("clienteView")
            Toast.makeText(context, "Cliente seleccionado", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Botón Cliente")
        }

        // Botón de Entrenador
        Button(onClick = {
            // Navega a EntrenadorView cuando se selecciona Entrenador
            navController.navigate("entrenadorView")
            Toast.makeText(context, "Entrenador seleccionado", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Botón Entrenador")
        }
    }
}
