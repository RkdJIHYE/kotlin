package com.back.ex10

import com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length

fun main(){
    val name : String ? =null
    println (name?.length?: "Name is null")
}