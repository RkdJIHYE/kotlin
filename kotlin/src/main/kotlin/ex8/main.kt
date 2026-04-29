package com.back.ex8

fun main(){
    val names = mutableListOf("Alice", "Bob", "Cedric")

    names.add("Daniel")

    for(name in names){
        println(name)
    }

}