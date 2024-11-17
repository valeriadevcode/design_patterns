package com.example.p2_arqui.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainView() {
    // Estado para el RadioGroup
    var selectedOption by remember { mutableStateOf("Cliente") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Título
        Text(
            text = "Main",
            fontSize = 24.sp,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Grupo de RadioButtons
        Column(modifier = Modifier.padding(bottom = 16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = selectedOption == "Cliente",
                    onClick = { selectedOption = "Cliente" }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Cliente")
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = selectedOption == "Entrenador",
                    onClick = { selectedOption = "Entrenador" }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Entrenador")
            }
        }

        // Botón "Iniciar Sesión"
        Button(
            onClick = {
                // Acción al presionar "Iniciar Sesión"
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        ) {
            Text("Iniciar Sesión")
        }

        // Botón "Registrar"
        Button(
            onClick = {
                // Acción al presionar "Registrar"
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Registrar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainView() {
    MainView()
}
