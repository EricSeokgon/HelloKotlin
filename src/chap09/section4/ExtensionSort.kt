package chap09.section4

fun main() {
    // reversed: 뒤집힌 순서로 컬렉션 반환
    val unsortedList = listOf(3, 2, 7, 5)
    println(unsortedList.reversed())

    //sorted: 요소를 정렬한 후 정렬된 컬렉션 반환
    println(unsortedList.sorted())

    //sortedDescending: 내님차순 정렬
    println(unsortedList.sortedDescending())

    //sortedBy: 특정 비교식에 의해 정렬된 컬렉션 반환
    println(unsortedList.sortedBy { it % 3 })
    println(unsortedList.sortedByDescending { it % 3 })


}