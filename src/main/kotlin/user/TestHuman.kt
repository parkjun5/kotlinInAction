package user

import domain.Human

fun main() {
    val human = Human("박세준", false)
    println("human is married ${human.isMarried}")
    val declaredConstructors = human.javaClass.declaredConstructors
    for (declaredConstructor in declaredConstructors) {
        println("declaredConstructor = $declaredConstructor")
    }
    val declaredMethods = human.javaClass.declaredMethods
    for (declaredMethod in declaredMethods) {
        println("declaredMethod.name = ${declaredMethod.name}")
        println("declaredMethod.parameters = ${declaredMethod.parameters}")
        println("declaredMethod.returnType = ${declaredMethod.returnType}")
    }

}

