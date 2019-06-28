package chap05.section1.define

class Bird { //1클래스의 정의
    //2프로퍼티
    var name: String = "myBird"
    var wing: Int = 2
    var brek: String = "short"
    var color: String = "blue"

    //3메서드(함수)
    fun fly() = println("Fly wing:$wing")

    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird() //4클래스의 생성자를 통한 객체의 생성
    coco.color = "blue" //5객체의 프로퍼티에 값 할당

    println("coco.color: ${coco.color}") //6객체의 멤버 프로퍼티 읽기
    coco.fly() //7객체의 멤버 메서드 사용
    coco.sing(3)
}