package com.example.kotlinfundamentals

fun main() {
    var heightPerson1 = 170
    var heightPerson2 = 189

    if (heightPerson1 > heightPerson2) {
        println("use raw force")
    } else if (heightPerson1 == heightPerson2) {
        println("use 1337")
    } else {
        println("use technique")
    }
    var age = 17
    if (age >= 21) {
        println("Now you may drink in the US")
    } else if (age >= 18) {
        println("You may vote now")
    } else if (age >= 16) {
        println("You may drive now")
    } else {
        println("You are too young")
    }

}