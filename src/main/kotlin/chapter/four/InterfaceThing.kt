package chapter.four

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!!")
}

interface Focusable {
    fun setFocus(b : Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!!")
}

class Button : Clickable, Focusable{
    override fun click() = println("I was Clicked!")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

open class RichButton : Clickable {
    fun disable() = println("you can't override this")
    open fun animate() = println("can override this")
    final override fun click() = println("I was Clicked!")
}

class RichButtonTwo : RichButton() {
    override fun animate() = println("buuuutton!!")

    override fun showOff() = println("I'm Rich2")


}

fun main() {
    val button = Button()
    button.showOff()
    button.click()
    button.setFocus(true)

    val richButton = RichButton()
    richButton.animate()
    richButton.showOff()
    richButton.disable()

    val richButtonTwo = RichButtonTwo()
    richButtonTwo.animate()
    richButtonTwo.showOff()
    richButtonTwo.disable()
}