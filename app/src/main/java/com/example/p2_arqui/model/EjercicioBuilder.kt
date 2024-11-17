package com.example.p2_arqui.model

interface EjercicioBuilder {
    fun setNombre(nombre: String)
    fun setDuracion(duracion: Int)
    fun setGrupoMuscular(grupoMuscular: String)
    fun construir(): Ejercicio
}
