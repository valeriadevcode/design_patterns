package com.example.p2_arqui.model

class CardioBuilder : EjercicioBuilder {
    private val ejercicio = Ejercicio("", 0, "")

    override fun setNombre(nombre: String) {
        ejercicio.nombre = nombre
    }

    override fun setDuracion(duracion: Int) {
        ejercicio.duracion = duracion
    }

    override fun setGrupoMuscular(grupoMuscular: String) {
        ejercicio.grupoMuscular = grupoMuscular
    }

    override fun construir(): Ejercicio {
        return ejercicio
    }

    fun crearCardio(): Ejercicio {
        setNombre("Cardio Intensivo")
        setDuracion(30) // minutos
        setGrupoMuscular("Cardio")
        return construir()
    }
}

