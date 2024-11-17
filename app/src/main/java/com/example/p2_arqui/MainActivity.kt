package com.example.p2_arqui.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Configurar la navegación
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "main") {
                // Definir las rutas y sus correspondientes composables
                composable("main") {
                    MainScreen(navController)
                }
                composable("loginCliente") {
                    LoginClienteScreen()
                }
                composable("registroCliente") {
                    RegistroClienteScreen()
                }
                composable("loginEntrenador") {
                    LoginEntrenadorScreen()
                }
                composable("registroEntrenador") {
                    RegistroEntrenadorScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen(navController: NavHostController) {
    var selectedOption = "Cliente" // Estado para seleccionar entre Cliente y Entrenador

    // Acomoda los elementos de la UI con un Column
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        // Título de la pantalla
        Text(
            text = "Personal Trainer",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )

        // Grupo de botones radio
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp)
            ) {
                RadioButton(
                    selected = selectedOption == "Cliente",
                    onClick = { selectedOption = "Cliente" }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Cliente")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp)
            ) {
                RadioButton(
                    selected = selectedOption == "Entrenador",
                    onClick = { selectedOption = "Entrenador" }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Entrenador")
            }
        }

        // Botón Iniciar Sesión
        Button(
            onClick = {
                // Lógica para la navegación según el RadioButton seleccionado
                if (selectedOption == "Cliente") {
                    navController.navigate("loginCliente")
                } else {
                    navController.navigate("loginEntrenador")
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            Text(text = "Iniciar Sesión")
        }

        // Botón Registrar
        Button(
            onClick = {
                // Lógica para la navegación según el RadioButton seleccionado
                if (selectedOption == "Cliente") {
                    navController.navigate("registroCliente")
                } else {
                    navController.navigate("registroEntrenador")
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            Text(text = "Registrar")
        }
    }
}

// Composables de las pantallas de Login y Registro para Cliente y Entrenador

@Composable
fun LoginClienteScreen() {
    // Contenido para LoginCliente
    Text("Pantalla de Login Cliente")
}

@Composable
fun RegistroClienteScreen() {
    // Contenido para RegistroCliente
    Text("Pantalla de Registro Cliente")
}

@Composable
fun LoginEntrenadorScreen() {
    // Contenido para LoginEntrenador
    Text("Pantalla de Login Entrenador")
}

@Composable
fun RegistroEntrenadorScreen() {
    // Contenido para RegistroEntrenador
    Text("Pantalla de Registro Entrenador")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val navController = rememberNavController()
    MainScreen(navController)
}
