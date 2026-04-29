package com.back.ex24

import com.back.ex12.Person

class Person(
    var name: String = "",
    var age: Int = 0
) {
    fun printInfo() {
        println("Name: $name, Age: $age")
    }
}

fun main(){
    val person1 = Person()
    person1.name =  "John"
    person1.age = 20

    person1.printInfo()

    val person2 = Person().apply{
        name = "John"
        age = 25
    }

    person2.printInfo()
}