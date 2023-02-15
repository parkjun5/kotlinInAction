package domain

import java.util.Random

class Rectangle(val height: Int, val width : Int) {
    val isSquare: Boolean
        get() {
           return height == width
        }

    override fun toString(): String {
        return "높이: $height 길이: $width"
    }
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}