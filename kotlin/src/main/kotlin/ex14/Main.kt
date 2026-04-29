package com.back.ex14

fun sayHello(name: String="Guest") {
    println("Hello, $name!")
}

fun main() {
    sayHello() //기본 값 사용
    sayHello("Alice")

}