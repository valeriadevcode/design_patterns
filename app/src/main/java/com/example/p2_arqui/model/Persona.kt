package com.example.p2_arqui.model

open class Persona(
    val id: Int,
    val nombre: String,
    val telefono: String,
    val usuario: String,
    val password: String
) : Button {
    // Métodos heredados de la interfaz Button
    override fun render() {
        println("Renderizando la persona: $nombre")
    }

    override fun onClick() {
        println("Persona $nombre clickeada")
    }

    open fun crear(): Persona {
        // Lógica común para crear una Persona (solo de ejemplo)
        return Persona(id, nombre, telefono, usuario, password)
    }
}
