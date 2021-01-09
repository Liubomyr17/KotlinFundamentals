package com.example.kotlinfundamentals

fun main() {
    // type String
    val myName = "Leo"
    // type int (32 bits of memory)
    val myAge = 31

    val myByte: Byte = 13 // 8 bits
    val myShort: Short = 125 // 16 bits
    val myInt: Int = 123123123 // 32 bits
    val myLong: Long = 12_039_812_309 // 64 bits

    val myFloat: Float = 13.37F // 32 bits
    val myDouble = 3.14151236987 // 64 bits

    // Booleans
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '$'

    // Strings
    val myStr = "Hello World"
    val firstCharInStr = myStr[0]
    val lastCharInString = myStr[myStr.length - 1]

    println("First character + $firstCharInStr")
    println("First character + $lastCharInString")




}