package chap09.section3

fun main() {
    val intsListedHashSet: java.util.LinkedHashSet<Int> = linkedSetOf(35, 21, 76, 26, 75)
    intsListedHashSet.add(4)
    intsListedHashSet.remove(21)

    println(intsListedHashSet)
    intsListedHashSet.clear()
    println(intsListedHashSet)

}