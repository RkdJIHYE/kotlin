package com.back.ex11

fun main(){
    val names = listOf("Alice", "Bob", "Charlie")

    names.forEach {name->println(name)}
    //매개변수 하나일때는 생략하고 it으로 쓸 수 있다
    names.forEach {println(it)}
}