package com.example.p2_arqui.model

class Cliente(
    id: Int,
    nombre: String,
    telefono: String,
    usuario: String,
    password: String,
    val altura: Double,
    val peso: Double
) : Persona(id, nombre, telefono, usuario, password)
