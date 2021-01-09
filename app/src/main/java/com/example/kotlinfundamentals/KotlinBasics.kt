package com.example.kotlinfundamentals

fun main() {

    // Arithmetic operators (+, -, *, /, %)
    var result = 5 + 3
    val a = 5.0
    val b = 3
    var resultDouble : Double
    resultDouble = a / b
//    println("Result: $resultDouble")
    // Result: 1.6666666666666667

    // Comparison operators (==, !=, <, >, <=, =>)
    val isEqual = 5 == 3
    println("isEqual is $isEqual")
    val isNotEqual = 5 != 5
    println("isNotEqual is $isNotEqual")
    println("is5greater3 ${5 > 3}")
    println("is5LowerEqual3 ${5 <= 3}")
//    is5greater3 true
//    is5LowerEqual3 false
}