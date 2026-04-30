package com.back.ex33

open class Animal(){
    open fun makeSound(){
        println("Animal make sound")
    }
}

class Dog : Animal(){
    override fun makeSound() {
        println("Bark Bark")
    }
}

fun main(){
    Dog().makeSound()
}