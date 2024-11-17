package com.example.p2_arqui.model

class EjercicioFuerza : ProcesoEjercicio() {

    override fun preparar() {
        // Preparación para el ejercicio de fuerza
        println("Preparando el ejercicio de Fuerza...")
    }

    override fun ejecutar() {
        // Ejecución del ejercicio de fuerza
        println("Ejecutando ejercicio de Fuerza: 4 series de sentadillas.")
    }

    override fun finalizar() {
        // Finalización del ejercicio de fuerza
        println("Finalizando el ejercicio de Fuerza...")
    }
}
