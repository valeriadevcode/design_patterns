package com.example.p2_arqui.controller

import com.example.p2_arqui.model.Persona

class CrearController {
    fun ejecutar() {
        // Llamada a los métodos de la clase Persona para crear Cliente y Entrenador
        val persona = Persona(1, "Juan Pérez", "123456789", "juanp", "password123")

        // Mostrar información sobre la persona
        persona.render()
        persona.onClick()

        // Crear Cliente
        val cliente = persona.crearCliente(2, "Carlos García", "987654321", "carlosg", "password456", 1.80, 75.0)
        cliente.render()  // Llamada al método render() de Cliente
        cliente.onClick() // Llamada al método onClick() de Cliente

        // Crear Entrenador
        val entrenador = persona.crearEntrenador(3, "Laura López", "567890123", "laural", "password789")
        entrenador.render()  // Llamada al método render() de Entrenador
        entrenador.onClick() // Llamada al método onClick() de Entrenador
    }
}
