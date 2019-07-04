package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)

    var person = Person("Kilfong", "Kotlin")
    val a = person.let {
        it.skills = "Android"
        "success"
    }
    println(person)
    println("a: $a")
    val b = person.also {
        it.skills = "Java"
        "success"
    }
    println(person)
    println("b: $b")

}