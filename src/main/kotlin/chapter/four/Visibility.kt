package chapter.four

internal open class TalkativeButton : Focusable {
    private fun yell() = println("HEY!")
    protected fun whisper() = println("Let's Talk!")
}

// You cant approach internal TalkativeButton
/*
fun TalkativeButton.giveSpeech() {
    yell()
    whisper()
}
*/

open class TalkativeButtonPublic : Focusable {
    private fun yell() = println("HEY!")
    protected fun whisper() = println("Let's Talk!")

    internal fun heyhey() {
        yell()
        whisper()
    }
}

fun TalkativeButtonPublic.giveSpeech() {
    //private and protect can't approach
/*    yell()
    whisper()*/
    // can touch internal method
    heyhey()
}

fun main() {
    val talkativeButtonPublic = TalkativeButtonPublic()
    talkativeButtonPublic.giveSpeech()
}
