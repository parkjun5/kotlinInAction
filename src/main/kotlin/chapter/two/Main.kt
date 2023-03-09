package chapter.two

import java.util.Random

fun main(args: Array<String>) {
    println("Hello World!")
    val numTypeTest = "" + 1
    println(numTypeTest)
    println(numTypeTest.javaClass)
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val stringExample : String
    val random = Random()
    val someInt = random.nextInt(2)
    stringExample = if (someInt == 1) "일이야" else "아니야"

    println("$someInt == 1 ? -> \"$stringExample\" " )
    println("$someInt == 1 => ${if (someInt == 1) "True" else "False"}")
}