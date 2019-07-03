package chap09.section3

fun main() {
    // 가변형 Map의 선언 및 초기화
    val capitalCityMap: MutableMap<String, String> =
        mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japan" to "Tokyo")

    println(capitalCityMap.values) //값만 출력
    println(capitalCityMap.keys) //키만 출력

    capitalCityMap.put("UK", "London")
    capitalCityMap.remove("China")
    println(capitalCityMap)
}