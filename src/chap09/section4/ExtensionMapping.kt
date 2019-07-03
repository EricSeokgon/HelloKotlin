package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listWithNUll = listOf(1, null, 3, null, 5, 6)

    // map : 컬렉션에 주어진 식을 적용해 새로운 컬렉션 반환
    println(list.map { it * 2 })

    // mapIndexed: 컬렉션에 인덱스를 포함하고 주어진 식을 적용해 새로운 컬렉션 반환
    val mapIndexed = list.mapIndexed({ index, it -> index * it })
    println(mapIndexed)

    // mapNotNull: null을 제외하고 식을 적용해 새로운 컬렉션 반환
    println(listWithNUll.mapNotNull { it?.times(2) })

}