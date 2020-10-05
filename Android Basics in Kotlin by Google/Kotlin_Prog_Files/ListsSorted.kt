package com.example.affirmationsapp

fun main() {
    val colors = listOf("green", "orange", "blue")
    println("Reserved list: ${colors.reversed()}")
    println("List: $colors")
    println("Sorted list: ${colors.sorted()}")

    val oddNumbers = listOf(5,3,7,1)
    println("List: $oddNumbers")
    println("Sorted list ${oddNumbers.sorted()}")
}