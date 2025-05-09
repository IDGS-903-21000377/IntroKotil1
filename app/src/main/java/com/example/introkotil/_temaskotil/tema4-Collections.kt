package com.example.introkotil._temaskotil



fun main(){


    /*
    list
    mutablelist
    set
    mutableset
    map
    mutableMap


     */

    var lista = listOf<String>("Lunes","martes","Mieroles")
    println(lista)
    println(lista.size)
    println(lista.count())
    println(lista.get(0))
    println(lista[1])
    println(lista.indexOf("miercoles"))
    println(lista.first())
    println(lista.last())

    var listamutable = mutableListOf<String>("Lunes","martes","Miercoles")
    println(listamutable)
    listamutable.add("Jueves")
    println(listamutable)
    listamutable.removeAt(0)
    println(listamutable)
    listamutable.add(0,"domingo")
    println(listamutable)
    listamutable.remove("miercoles")




}