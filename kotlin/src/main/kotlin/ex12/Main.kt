package com.back.ex12

data class Person(val name :String, val age:Int){

}

fun main (){

    val p1 = Person ("Alice",20)
    val p2 = Person("Alice",29)

    println(p1)
    println(p2==p1)
}