package com.example.kotlinfundamentals

fun main() {
    var myName = "Leo"
    println("Hello " + myName)
    println("Hello $myName")

    // Difference between VAR and VAL
    myName = "Francis"
    println("Hello $myName")

//    val myName = "Frank" --> error VAR is mutable / VAL is immutable
//    println("Hello $myName")

}