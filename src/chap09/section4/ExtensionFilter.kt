package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listMixed = listOf(1, "Hello", 3, "World", 5, 'A')
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // filter: 식에 따라 요소를 골라내기
    println(list.filter { it % 2 == 0 }) //짝수만 골라내기
    println(list.filterNot { it % 2 == 0 }) //식 이외에 요소 골라내기
    println(listWithNull.filterNotNull()) // null을 제외

}