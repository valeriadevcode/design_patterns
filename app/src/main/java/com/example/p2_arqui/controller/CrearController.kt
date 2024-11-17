package com.example.p2_arqui.controller

import com.example.p2_arqui.model.Cliente
import com.example.p2_arqui.model.Entrenador
import android.content.Context
import com.example.p2_arqui.model.JsonData
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.io.InputStreamReader

class CrearController(private val context: Context) {

    fun ejecutar() {
        // Leer el archivo JSON desde la carpeta assets
        val jsonString = cargarJsonDesdeAssets("usuarios.json")

        // Deserializar el JSON
        val json = Json { ignoreUnknownKeys = true }
        val data = json.decodeFromString<JsonData>(jsonString)

        // Crear Clientes y Entrenadores a partir del JSON
        val clientes = data.clientes.map {
            Cliente(it.id, it.nombre, it.telefono, it.usuario, it.password, it.altura, it.peso)
        }

        val entrenadores = data.entrenadores.map {
            Entrenador(it.id, it.nombre, it.telefono, it.usuario, it.password)
        }

        // Mostrar información sobre los Clientes y Entrenadores
        clientes.forEach {
            it.render()
            it.onClick()
        }

        entrenadores.forEach {
            it.render()
            it.onClick()
        }
    }

    // Función para cargar el archivo JSON desde assets
    private fun cargarJsonDesdeAssets(nombreArchivo: String): String {
        val inputStream = context.assets.open(nombreArchivo)
        val reader = InputStreamReader(inputStream)
        return reader.readText()
    }
}
