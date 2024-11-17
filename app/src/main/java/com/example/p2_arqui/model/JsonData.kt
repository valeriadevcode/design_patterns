package com.example.p2_arqui.model
import kotlinx.serialization.Serializable

@Serializable
data class JsonData(
    val clientes: List<Cliente>,
    val entrenadores: List<Entrenador>
)