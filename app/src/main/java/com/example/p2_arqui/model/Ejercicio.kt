package com.example.p2_arqui.model

class Ejercicio(
    var nombre: String,
    var duracion: Int, // duración en minutos
    var grupoMuscular: String
) {
    override fun toString(): String {
        return "Ejercicio(nombre='$nombre', duracion=$duracion, grupoMuscular='$grupoMuscular')"
    }
}

