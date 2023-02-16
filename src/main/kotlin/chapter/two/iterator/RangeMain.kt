package chapter.two.iterator

import java.util.*

fun main() {
    fizzIterator()
    kotlinMap()
    iterWithIndex()

    println("'q' is Letter ${isLetter('q')}")
    println("'2' is Letter ${isLetter('2')}")

    println("'q' is Not Digit ${isNotDigit('q')}")
    println("'2' is Not Digit ${isNotDigit('2')}")

    println(recognize('b'))
    println(recognize('3'))

    println("Kotlin" in "Java".."Scala")
    println("박세준" in "김세준".."라세준")

    println("Kotlin" in setOf("Java", "Scala"))

}


private fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "$c <- It's a digit"
    in 'a'..'z', in 'A'..'Z' -> "$c <- It's a letter"
    else -> "I don't know"
}

private fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

private fun isNotDigit(c: Char) = c !in '0'..'9'

private fun fizzGame(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

private fun fizzIterator() {
    val oneToTen = 1..16
    for (idx in oneToTen) {
        println(fizzGame(idx))
    }

    for (i in 4 downTo 0 step 2) {
        println(fizzGame(i))
    }

    for (idx in 0 until 20 step 5) {
        print(fizzGame(idx))
    }
    println()
}


private fun kotlinMap() {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    for ((letter, binaryRep) in binaryReps) {
        println("$letter = $binaryRep")
    }
}

private fun iterWithIndex() {
    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index -> element: $element")
    }
}