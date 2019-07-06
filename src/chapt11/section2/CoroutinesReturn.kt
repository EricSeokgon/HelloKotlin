package chapt11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


fun main() {
    val job= GlobalScope.launch {
        kotlinx.coroutines.delay(1000L)
        println("World!")
    }

    println("Hello,")
    println("jbo.isActve: ${job.isActive}, completed: ${job.isCancelled}")
    Thread.sleep(2000L)
    println("jbo.isActve: ${job.isActive}, completed: ${job.isCancelled}")

}