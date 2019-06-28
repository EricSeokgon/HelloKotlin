package chap05.section3

//상속 가능한 클래스를 선언하기 위해 open사용
open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {

    //메서드
    fun fly() = println("Fly wing: $wing")

    open fun sing(vol: Int) = println("Sing vol: $vol") //오버라이딩 가능한 메서드
}


class Parrot(name: String, wing: Int, beak: String, color: String, var language: String = "natural") : Bird(
    name,
    wing,
    beak,
    color
) {
    fun speak() = println("Speak! $language") //Parrot에 추가된 메서드
    override fun sing(vol: Int) { //오버라이딩된 메서드
        println("I'm a parrot! the volume level is $vol")
        speak()
    }
}

fun main() {

    val parrot = Parrot("myparrot", 2, "short", "multiple")
    parrot.language = "English"

    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    parrot.sing(5)
}






