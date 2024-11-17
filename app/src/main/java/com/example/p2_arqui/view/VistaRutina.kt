package com.example.p2_arqui.view

import com.example.p2_arqui.controller.RutinaController

class VistaRutina {
    private val controller = RutinaController()

    fun mostrarMenu() {
        println("Selecciona el tipo de ejercicio:")
        println("1. Crear Ejercicio Cardio")
        println("2. Crear Ejercicio Fuerza")
        println("3. Ver Ejercicio Actual")
        println("4. Salir")

        when (readLine()) {
            "1" -> crearCardio()
            "2" -> crearFuerza()
            "3" -> verEjercicio()
            "4" -> return
            else -> println("Opción no válida.")
        }
        mostrarMenu()
    }

    fun crearCardio() {
        val ejercicio = controller.crearCardio()
        println("Ejercicio Cardio creado: $ejercicio")
    }

    fun crearFuerza() {
        val ejercicio = controller.crearFuerza()
        println("Ejercicio Fuerza creado: $ejercicio")
    }

    fun verEjercicio() {
        val ejercicio = controller.obtenerEjercicio()
        if (ejercicio != null) {
            println("Ejercicio actual: $ejercicio")
        } else {
            println("No hay ningún ejercicio creado aún.")
        }
    }
}
