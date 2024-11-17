package com.example.p2_arqui.controller

import com.example.p2_arqui.model.CardioBuilder
import com.example.p2_arqui.model.Ejercicio
import com.example.p2_arqui.model.FuerzaBuilder


class RutinaController {

    private var ejercicio: Ejercicio? = null

    // Función para crear ejercicio Cardio utilizando el Builder
    fun crearCardio(): Ejercicio {
        val builder = CardioBuilder()

        // Configuramos el ejercicio usando el Builder
        builder.setNombre("Ejercicio Cardio")
        builder.setDuracion(30) // Duración en minutos
        builder.setGrupoMuscular("Cardiovascular")

        // Construimos el ejercicio
        ejercicio = builder.construir()
        return ejercicio!!
    }

    // Función para crear ejercicio Fuerza utilizando el Builder
    fun crearFuerza(): Ejercicio {
        val builder = FuerzaBuilder()

        // Configuramos el ejercicio usando el Builder
        builder.setNombre("Ejercicio de Fuerza")
        builder.setDuracion(45) // Duración en minutos
        builder.setGrupoMuscular("Musculación")

        // Construimos el ejercicio
        ejercicio = builder.construir()
        return ejercicio!!
    }

    // Función para obtener el ejercicio actual
    fun obtenerEjercicio(): Ejercicio? {
        return ejercicio
    }
}
