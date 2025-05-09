package com.example.introkotil._temaskotil

fun main() {
    var input: String

    do {
        println("piramide")
        print("Selecciona una opcion (0 para salir): ")
        input = readln()

        if (input == "*") {
            println("Opcion invalida. No se acepta '*'.")
            continue
        }

        val opcion = input.toIntOrNull()

        if (opcion == null || opcion < 0) {
            println("Opcion invalida. Pon un numero mayor o igual a 0.")
        } else if (opcion == 0) {
            println("byeee")
            break
        } else {
            for (i in 1..opcion) {
                println("*".repeat(i))
            }
        }

    } while (true)
}

