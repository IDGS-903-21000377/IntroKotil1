package com.example.introkotil._temaskotil



fun main(){

    /*
    range
    1..4 = 1,2,3,4
    1..<4  = 1,2,3
    4 downTo 1 = 4,3,2,1
    1..5 step 2 = 1,3,5
    'a'.. 'z' = a,b,c,d,e,f,g,h,i,j,k,l,m,n,ñ,o



     */

    for(num in 1..5){
        println(num)
    }

    val frutas = listOf("manzana","Pera","Frambueza","Durazno")

    for(fruta in frutas){
        println(frutas)
    }

    val n = 10
    var d = 8
    while (d<n){

        println(d)
        d++
    }




}