package com.example.introkotil._temaskotil

fun main() {

        var opcion = 0

        do {
            println("\nCalculadora")
            println("1. Suma")
            println("2. Resta")
            println("3. Multiplicacion")
            println("4. División")
            println("5. Salir")
            print("Selecciona una opcion: ")
            opcion = readln().toInt()

            if (opcion in 1..4) {
                print("Ingresa el primer numero: ")
                val num1 = readln().toDouble()
                print("Ingresa el segundo numero: ")
                val num2 = readln().toDouble()

                var resultado = 0.0

                do {
                    if (opcion == 1) {
                        resultado = num1 + num2
                        println("Resultado: $resultado")
                        break
                    }

                    if (opcion == 2) {
                        resultado = num1 - num2
                        println("Resultado: $resultado")
                        break
                    }

                    if (opcion == 3) {
                        resultado = num1 * num2
                        println("Resultado: $resultado")
                        break
                    }

                    if (opcion == 4) {
                        if (num2 != 0.0) {
                            resultado = num1 / num2
                            println("Resultado: $resultado")
                        } else {
                            println("Error: no se puede dividir entre cero")
                        }
                        break
                    }

                } while (true)
            } else if (opcion != 5) {
                println("Opcion no válida")
            }

        } while (opcion != 5)

        println("byeee")
    }

