fun main () {
    val border = "`-._,-'"
    val timesToRepeat = 4
    val age = 5 * 365
    val name = "Rover"
    printBorder(border, timesToRepeat)
    println("Happy Birthday, ${name}!")
    printBorder(border, timesToRepeat)


    // Let's print a cake!
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")

    // This prints an empty line.
    println("")

    println("You are already ${age} days old, ${name}!")
    println("${age} days old is the very best age to celebrate!")

    println()
    val ageAnna = 20
    val layers = 5
     printCakeCandles(ageAnna)
     printCakeTop(ageAnna)
     printCakeBottom(ageAnna, layers)
}

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}

fun printCakeTop(ageAnna: Int) {
    repeat(ageAnna + 2) {
        print("=")
    }
    println()
}

fun printCakeCandles(ageAnna: Int){
    print(" ")
    repeat(ageAnna) {
        print(",")
    }
    println()

    println(" ")
    repeat(ageAnna) {
        print("|")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}
