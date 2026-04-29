package com.back.ex9

import jdk.internal.org.jline.keymap.KeyMap.key

fun main(){
    val ages = mutableListOf("Peter" to 24, "clark" to 31 , "Bruce" to 32)


    for ((key,value) in ages){
        println("$key is $value years old.")
    }
}