package com.example.p2_arqui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.p2_arqui.controller.EjecutarController
import com.example.p2_arqui.ui.theme.PersonalTrainerTheme

class EjecutarView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalTrainerTheme {
                // Llamamos a la pantalla principal de la app
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    // Creamos el controlador de ejecución
    val controller = EjecutarController()

    // Layout principal
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Título de la app
        Text(text = "Personal Trainer", style = MaterialTheme.typography.headlineLarge)

        Spacer(modifier = Modifier.height(32.dp))

        // Botón para ejecutar Cardio
        Button(
            onClick = { controller.ejecutarCardio() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text(text = "Ejercicio Cardio")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Botón para ejecutar Fuerza
        Button(
            onClick = { controller.ejecutarFuerza() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text(text = "Ejercicio Fuerza")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PersonalTrainerTheme {
        MainScreen()
    }
}
