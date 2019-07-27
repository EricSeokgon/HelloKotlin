package chapt11.section3

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val channel = Channel<Int>(3)
    val sender = launch(coroutineContext) {
        repeat(10) {
            println("Sending $it")
            channel.send(it)
        }
    }
    kotlinx.coroutines.delay(1000)
    sender.cancel()


}

