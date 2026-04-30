package com.back.ex25


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

    val rst2 = Person().apply{
        name = "Alice"
        age = 25
    }.let{
        it.age +10
    }

    println(rst2)
}