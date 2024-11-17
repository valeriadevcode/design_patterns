package com.example.p2_arqui.controller

import com.example.p2_arqui.model.EjercicioCardio
import com.example.p2_arqui.model.EjercicioFuerza


class EjecutarController {

    private val ejercicioCardio = EjercicioCardio()
    private val ejercicioFuerza = EjercicioFuerza()

    fun ejecutarCardio() {
        ejercicioCardio.realizarEjercicio()
    }

    fun ejecutarFuerza() {
        ejercicioFuerza.realizarEjercicio()
    }
}
