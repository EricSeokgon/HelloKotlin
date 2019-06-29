package chap06.section1.customgetset

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("The name was changed")
            field = value.toUpperCase() //1받은 인자를 대문자로 변경해 프로퍼티에 할당
        }
    var age: Int = _age
}

fun main() {
    val user1 = User(1, "Kildong", 35)

    user1.name = "coco"
    println("name3.name: ${user1.name}")
}
