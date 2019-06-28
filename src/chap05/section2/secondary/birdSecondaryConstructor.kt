package chap05.section2.secondary

// 주생성자가 없고 여러개의 부 생성자를 가진 클래스
class Bird {
    //프로퍼티
    var name: String
    var wing: Int
    var brek: String
    var color: String

    //첫 번째 부 생성자
    constructor(_name: String, _wing: Int, _brek: String, _color: String) {
        name = _name
        wing = _wing
        brek = _brek
        color = _color
    }

    //두 번째 부 생성자
    constructor(_name: String, _brek: String) {
        name = _name
        wing = 2
        brek = _brek
        color = "grey"
    }

    //매서드
    fun fly() = println("Fly wing: $wing")

    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val bird1 = Bird("mybird", 2, "short", "blue") //첫번째 부 생성자 호출
    val bird2 = Bird("mybird2", "long") //두번째 부 생성자 호출

    bird1.color = "yellow" //5객체의 프로퍼티에 값 할당
    println("bird1.color: ${bird1.color}")
    bird1.fly()
    bird1.sing(1)
    println()
    println("bird2.color: ${bird2.color}")
    bird2.fly()
    bird2.sing(2)
}
