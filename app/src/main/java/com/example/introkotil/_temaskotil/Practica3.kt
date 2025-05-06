package com.example.introkotil._temaskotil

import kotlin.math.sqrt
import kotlin.math.sqrt

fun main() {
    println("Ecuaciones cuadraticas")

    print("Ingresa el valor de a: ")
    val a = readln().toDoubleOrNull()

    print("Ingresa el valor de b: ")
    val b = readln().toDoubleOrNull()

    print("Ingresa el valor de c: ")
    val c = readln().toDoubleOrNull()

    if (a == null || b == null || c == null) {
        println("Uno de los valores no es valido. Usa solo números.")
        return
    }

    if (a == 0.0) {
        println("Esto no es una ecuacion cuadratica porque 'a' no puede ser 0.")
        return
    }

    val discriminante = b * b - 4 * a * c

    when {
        discriminante > 0 -> {
            val x1 = (-b + sqrt(discriminante)) / (2 * a)
            val x2 = (-b - sqrt(discriminante)) / (2 * a)
            println("Las soluciones reales son:")
            println("x1 = $x1")
            println("x2 = $x2")
        }
        discriminante == 0.0 -> {
            val x = -b / (2 * a)
            println("La solucion doble es:")
            println("x = $x")
        }
        else -> {
            val parteReal = -b / (2 * a)
            val parteImaginaria = sqrt(-discriminante) / (2 * a)
            println("Las soluciones imaginarias son:")
            println("x1 = $parteReal + ${parteImaginaria}i")
            println("x2 = $parteReal - ${parteImaginaria}i")
        }
    }
}

