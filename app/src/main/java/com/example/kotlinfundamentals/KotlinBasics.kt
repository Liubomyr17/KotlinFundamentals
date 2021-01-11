package com.example.kotlinfundamentals

fun main() {
    var month = 3
    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> { println("Nothing special")
    }
    }
  }
