package com.example.p2_arqui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.p2_arqui.ui.theme.PersonalTrainerTheme
import com.example.p2_arqui.view.LoginClienteScreen
import com.example.p2_arqui.view.LoginEntrenadorScreen
import com.example.p2_arqui.view.RegistroCliente
import com.example.p2_arqui.view.RegistroEntrenador

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            AppNavigation(navController) // Llamada a la navegación principal
        }
    }
}


@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            MainScreen(navController)
        }
        composable("loginCliente") {
            LoginClienteScreen()
        }
        composable("loginEntrenador") {
            LoginEntrenadorScreen()
        }
        composable("registroCliente") {
            RegistroCliente()
        }
        composable("registroEntrenador") {
            RegistroEntrenador()
        }
    }
}


@Composable
fun MainScreen(navController: NavHostController) {
    var selectedOption by remember { mutableStateOf("Cliente") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "Personal Trainer",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp),
                verticalAlignment = Alignment.CenterVertically
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
                    .padding(start = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = selectedOption == "Entrenador",
                    onClick = { selectedOption = "Entrenador" }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Entrenador")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                val route = if (selectedOption == "Cliente") "loginCliente" else "loginEntrenador"
                navController.navigate(route)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            Text(text = "Iniciar Sesión")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                val route = if (selectedOption == "Cliente") "registroCliente" else "registroEntrenador"
                navController.navigate(route)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            Text(text = "Registrar")
        }
    }
}

