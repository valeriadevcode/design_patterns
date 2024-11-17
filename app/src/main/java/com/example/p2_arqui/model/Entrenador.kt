package com.example.p2_arqui.model
import kotlinx.serialization.Serializable

@Serializable
class Entrenador(
    id: Int,
    nombre: String,
    telefono: String,
    usuario: String,
    password: String
) : Persona(id, nombre, telefono, usuario, password) {

    override fun crear(): Entrenador {
        return Entrenador(id, nombre, telefono, usuario, password)
    }
}
