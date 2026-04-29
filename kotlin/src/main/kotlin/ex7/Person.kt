package com.back.ex7

class Person (val name : String) {
    fun greet(){
        println("hello my name is $name")
    }
}

fun main(){
    val person = Person("Alice")
    person.greet()
}