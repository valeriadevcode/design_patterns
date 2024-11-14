package com.example.p2_arqui.model

class ClienteButton : Button {
    override fun render() {
        println("Renderizando botón de Cliente")
    }

    override fun onClick() {
        println("Haciendo clic en el botón de Cliente")
    }
}