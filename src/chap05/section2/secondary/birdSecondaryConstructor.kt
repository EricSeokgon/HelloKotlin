package chap05.section2.secondary

class Bird {
    //1프로퍼티 선언만 함
    var name: String
    var wing: Int
    var brek: String
    var color: String

    //2부 생성자 - 매개변수를 통해 초기화할 프로퍼티에 지정
    constructor(name: String, wing: Int, brek: String, color: String) {
        this.name = name //3 this.name은 성언된 현재 클래스의 프로퍼티를 나타냄
        this.wing = wing
        this.brek = brek
        this.color = color
    }

    //매서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short","blue") //4 생성자의 인자로 객체 생성과 동시에 초기화

    coco.color = "yellow" //5객체의 프로퍼티에 값 할당
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}
