package chapt11.section2

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    launch {
        kotlinx.coroutines.delay(100L)
        println("World!")
    }
    println("Hello,")


}