package user

import datamodel.Color
import datamodel.getMnemonic
import datamodel.getWarmth
import datamodel.mix

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