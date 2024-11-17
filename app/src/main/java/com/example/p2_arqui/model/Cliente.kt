package com.example.p2_arqui.model

import kotlinx.serialization.Serializable


@Serializable
class Cliente(
    id: Int,
    nombre: String,
    telefono: String,
    usuario: String,
    password: String,
    val altura: Double,
    val peso: Double
) : Persona(id, nombre, telefono, usuario, password) {

    override fun crear(): Cliente {
        return Cliente(id, nombre, telefono, usuario, password, altura, peso)
    }
}