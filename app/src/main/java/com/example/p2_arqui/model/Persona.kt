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

    // Método para crear un Cliente
    fun crearCliente(id: Int, nombre: String, telefono: String, usuario: String, password: String, altura: Double, peso: Double): Cliente {
        return Cliente(id, nombre, telefono, usuario, password, altura, peso)
    }

    // Método para crear un Entrenador
    fun crearEntrenador(id: Int, nombre: String, telefono: String, usuario: String, password: String): Entrenador {
        return Entrenador(id, nombre, telefono, usuario, password)
    }
}
