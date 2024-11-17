package com.example.p2_arqui.model

abstract class ProcesoEjercicio {

    // Método Template
    fun realizarEjercicio() {
        preparar()       // Paso fijo
        ejecutar()       // Paso personalizable
        finalizar()      // Paso fijo
    }

    // Paso fijo: Preparar el ejercicio
    abstract fun preparar()

    // Paso abstracto: Ejecutar el ejercicio, debe ser implementado por las clases hijas
    abstract fun ejecutar()

    // Paso fijo: Finalizar el ejercicio
    abstract fun finalizar()
}
