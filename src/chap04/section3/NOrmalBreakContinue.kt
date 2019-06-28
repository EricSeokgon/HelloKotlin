package chap04.section3

fun main() {
    println("labelBreak")
    for (i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break
            print("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}