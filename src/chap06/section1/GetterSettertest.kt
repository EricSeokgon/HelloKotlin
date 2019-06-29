package chap06.section1

//주 생성자에 3개의 매개변수 정의
class User(_id: Int, _name: String, _age: Int) {
    //프로퍼티
    val id: Int = _id
    var name: String = _name
    var age: Int = _age
}

fun main() {
    val user = User(1, "Sean", 30)
    val name = user.name //게터에 의한 값 획득
    user.age = 41 //세터에 의한 값 지정
    println("name: $name, ${user.age}")
}
