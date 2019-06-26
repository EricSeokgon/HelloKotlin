package chap03.section3.funcref

fun main() {
    //1인자와 반홤값이 있는 함수
    val res1 = funcParam(3, 2, ::sum)
    println(res1)

    //2인자가 없는 함수
    hello(::text) //반환값이 없음

    //3일반 변수에 값처럼 할당
    val likeLambda = ::sum
    println(likeLambda(6, 6))
}

fun hello(body: (String, String) -> String): Unit {
    println(body("Hello", "World"))
}

fun sum(a: Int, b: Int) = a + b

fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}
