package chap07

interface Score {
    fun getScore(): Int
}

enum class MemberType(var prio: String) : Score {
    NORMAL("Thrid") {
        override fun getScore(): Int = 100 //구현된 메서드
    },
    SILVER("Second") {
        override fun getScore(): Int = 500
    },
    GOLD("First") {
        override fun getScore(): Int = 1500
    }
}

fun main() {
    println(MemberType.NORMAL.getScore())
    println(MemberType.GOLD)
    println(MemberType.valueOf(("SILVER")))
    println(MemberType.SILVER.prio)

    for (grade in MemberType.values()) { //모든 값을 가져오는 반복문
        println("grade.name = ${grade.name}, prio=${grade.prio}")
    }
}