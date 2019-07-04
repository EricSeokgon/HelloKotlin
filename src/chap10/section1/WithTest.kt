package chap10.section1

fun main() {
    data class User(var name: String, var skills: String, var email: String? = null)

    var user = User("Kilfong", "default")

    val result = with(user) {
        skills = "Kotlin"
        email = "kildong@example.com"
    }
    println(user)
    println("result: $result")
}