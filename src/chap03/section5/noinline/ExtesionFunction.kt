package chap03.section5.noinline

fun main() {
    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))
}

private fun String.getLongString(target: String): String =
    if (this.length > target.length) this else target

