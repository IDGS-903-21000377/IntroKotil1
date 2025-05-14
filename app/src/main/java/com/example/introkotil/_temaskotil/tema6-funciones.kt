package com.example.introkotil._temaskotil



fun sum(x:Int,y:Int): Int{
    return x+y
}

fun sum2(x: Int,y:Int) = x+y

fun saludo(){
    return println("Hola mundo")
}

fun main(){

    saludo()
    println("------------------------------------------------------------------------"
            +"")

    println(sum(2,3))
    println(sum2(3,4))

}


