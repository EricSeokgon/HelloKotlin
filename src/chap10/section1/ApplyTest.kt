package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)

    var person = Person("Kilfong", "Kotlin")
    person.apply { this.skills = "Swift" }
    println(person)

    val returnObj = person.apply {
        name = "Sean"
        skills = "Java"

    }
    println(person)
    println(returnObj)
}