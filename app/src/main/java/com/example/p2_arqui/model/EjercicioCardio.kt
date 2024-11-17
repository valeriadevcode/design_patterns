package com.example.p2_arqui.model

class EjercicioCardio : ProcesoEjercicio() {

    override fun preparar() {
        // Preparación para el ejercicio de cardio
        println("Preparando el ejercicio de Cardio...")
    }

    override fun ejecutar() {
        // Ejecución del ejercicio de cardio
        println("Ejecutando ejercicio de Cardio: 30 minutos de trote.")
    }

    override fun finalizar() {
        // Finalización del ejercicio de cardio
        println("Finalizando el ejercicio de Cardio...")
    }
}

