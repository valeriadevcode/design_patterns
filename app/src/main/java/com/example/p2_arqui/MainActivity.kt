package com.example.p2_arqui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.p2_arqui.ui.theme.P2_arquiTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.p2_arqui.view.MainView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            P2_arquiTheme {
                AppNavigation()  // Inicializa la navegación de la app
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "mainView") {
        composable("mainView") { MainView(navController) }
        //composable("clienteView") { ClienteView(navController) }
        //composable("entrenadorView") { EntrenadorView(navController) }
    }
}


