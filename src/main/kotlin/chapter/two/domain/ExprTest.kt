package chapter.two.domain

import chapter.two.datainterface.Expr
import chapter.two.datainterface.Num
import chapter.two.datainterface.Sum

fun main() {
    println(Num(1).value)

    println(Sum(Num(1), Num(2)))

    println(evalV1(Sum(Sum(Num(1), Num(2)), Num(4))))

    println(evalV2(Sum(Sum(Num(1), Num(2)), Num(4))))

    println(evalWithLog(Sum(Sum(Num(1), Num(2)), Num(4))))
}

/**
 *  자바같은 소스
 */
fun evalV1(e: Expr): Int {
    if (e is Num) {
        return e.value
    }
    if (e is Sum) {
        return evalV1(e.right) + evalV1(e.left)
    }
    throw IllegalArgumentException("Unknown expression evalV1")
}

/**
 *  코틀린 같은 소스
 */
fun evalV2(e: Expr): Int =
    when (e) {
        is Num ->
            e.value
        is Sum ->
            evalV2(e.right) + evalV2(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression evalV2")
    }

fun evalWithLog(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val right = evalWithLog(e.right)
            val left = evalWithLog(e.left)
            println("sum: $right + $left")
            right + left
        }
        else ->
            throw IllegalArgumentException("Unknown expression evalWithLog")
    }