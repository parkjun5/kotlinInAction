package chapter.two.user

import chapter.two.domain.Rectangle
import chapter.two.domain.createRandomRectangle

fun main() {
    val notSquare = Rectangle(10, 5)
    val square = Rectangle(10, 10)

    println("$notSquare is Square ? -> ${notSquare.isSquare}")
    println("$square is Square ? -> ${square.isSquare}")
    val randomRectangle = createRandomRectangle()
    print("$randomRectangle")
}