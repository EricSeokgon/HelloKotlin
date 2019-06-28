package chap04.section3.noinline

fun main() {
    retFunc()
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3, fun(a, b) {
        val result = a + b
        if (result > 10) return
        println("result: $result")
    }) // inlineLambda()의 끝부분
    println("end of retFunc")
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) { //inline을 제거
    out(a, b)
}
