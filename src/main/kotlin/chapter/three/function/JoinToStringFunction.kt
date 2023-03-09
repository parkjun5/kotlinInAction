package chapter.three.function

import java.lang.StringBuilder

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postFix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postFix)
    return result.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postFix: String = ""
) = joinToString(separator, prefix, postFix)

fun main() {
    val list = arrayListOf(1, 2, 3)

    val joinToString = list.joinToString("; ", "(", ")")
    println(joinToString)

    println(listOf("one", "two", "eight").join())

}