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
                EjecutarMainScreen() // Se renombró para evitar conflicto
            }
        }
    }
}

@Composable
fun EjecutarMainScreen() { // Función renombrada
    val controller = EjecutarController()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Personal Trainer", style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { controller.ejecutarCardio() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text(text = "Ejercicio Cardio")
        }

        Spacer(modifier = Modifier.height(16.dp))

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
fun EjecutarDefaultPreview() { // También renombrada para evitar conflicto con otro preview
    PersonalTrainerTheme {
        EjecutarMainScreen()
    }
}
