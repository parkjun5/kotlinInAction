package chapter.three.collection

import chapter.three.function.joinToString
import java.util.NoSuchElementException

fun main() {
    val set = hashSetOf(1, 7, 53)
    val findAny = set.stream().filter { each -> each > 50 }
        .findAny()
        .orElseThrow {
            throw NoSuchElementException("no Such elements")
        }
    println(findAny)
    val listOf = listOf("Kotlin", null, "from", null, null, "this")
    for (item in listOf) {
        item?.let { println(it) }
    }

    val list = arrayListOf(1, 2, 3)
    println(list.max())
    println(list.average())
    println(list.last())

    val map = hashMapOf(1 to "One", 7 to "Seven", 53 to "Fifty-three")
    for ((key, value) in map) {
        println("$key : $value")
    }
    println(map[1])
    println(map.getValue(53))
    println(map.putIfAbsent(3, "this"))
    println(map.putIfAbsent(3, "this2"))
    println(map)

    println(joinToString(listOf("a", "b", "c"), separator = "_", prefix = "===== Start Line ===== \n", postFix =  "\n ===== End Line ====="))
    println(joinToString(list))
    println(joinToString(list, postFix = "!!!!!!!"))

}

