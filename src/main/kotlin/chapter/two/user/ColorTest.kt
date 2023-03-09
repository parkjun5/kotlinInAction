package chapter.two.user

import chapter.two.datamodel.Color
import chapter.two.datamodel.getMnemonic
import chapter.two.datamodel.getWarmth
import chapter.two.datamodel.mix

fun main() {
    val blue = Color.BLUE
    println("blue.rgb() = ${blue.rgb()}")
    val mnemonic = getMnemonic(blue)
    println("mnemonic = $mnemonic")
    println(getMnemonic(blue))

    println(getWarmth(Color.YELLOW))

    println(mix(Color.RED, Color.YELLOW))
    println(mix(Color.RED, Color.BLUE))
}