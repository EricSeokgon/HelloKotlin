package chap03.section1

fun main() {
    val name = "홍길동"
    val email = "hong@example.kr"

    add(name)
    add(name, email)
    add("둘리", "dooly@example.kr")
    defaultArgs()
    defaultArgs(200)

}

fun defaultArgs(x: Int = 100, y: Int = 200) {
    println(x + y)

}

fun add(name: String, email: String = "default") {
    val optupt = "${name}님의 이메일은 ${email}입니다."
    println(optupt)

}
