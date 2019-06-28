package chap05.section2.init

//프로퍼티의 기본값 지정
class Bird(var name: String = "NONAME", var wing: Int = 2, var beak: String, var color: String) {
    // 초기화
    init {
        println("----------초기화 블록 시작----------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("----------초기화 블록 끝----------")
    }

    //메서드
    fun fly() = println("Fly wing: $wing")

    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird(beak = "long", color = "blue") //기본값이 잇는 것은 생략하고 없는 것만 전달 가능

    println("coco.name: ${coco.name}, coco.wing ${coco.wing}")
    println("coco.color: ${coco.color}, coco.beak ${coco.beak}")

}




