package chap06.section3

open class SuperMan() {
    fun work() = println("Taking phots")
    fun talk() = println("Talking with people")
    open fun fly() = println("Flying in the air.")

}

fun main() {
    val pretendedMan = object : SuperMan() {
        override fun fly() = println("I'm not a real superman. I can't fly!")
    }
    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()
}
