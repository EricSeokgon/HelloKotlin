package chap04.section3.noinline

fun main() {
    retFunc()
}

fun retFunc() {

    println("start of retFunc")
    inlineLambda(13, 3) { a, b ->
        val result = a + b
        if (result > 10) return@inlineLambda
        println("result: $result")
    }
    println("end of retFunc")
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) { //inline을 제거
    out(a, b)
}
