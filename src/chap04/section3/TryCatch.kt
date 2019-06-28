package chap04.section3

fun main() {
    val a = 6
    val b = 6
    val c:Int

    try {
        c = a / b //0으로 나눔
    } catch (e: ArithmeticException) {
        println("Exception is handled. ${e.message}")
    }finally {
        println("finally 블록은 반드시 항상 실행됨")
    }
}