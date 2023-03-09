package chapter.three.function
fun String.lastChar(): Char = get(length - 1)
val String.lastChar: Char get() = get(length - 2)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main() {
    println("KOTLIN".lastChar())
    println("KOTLIN".lastChar)

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)

}