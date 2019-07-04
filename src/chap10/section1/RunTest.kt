package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)

    var person = Person("Kilfong", "Kotlin")
    val returnObj = person.apply {
        this.name = "Sean"
        this.skills = "Java"
        "success"
    }
    println(person)
    println("retrunOBJ: $returnObj")

    val retunObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "success"
    }
    println(person)
    println("retrunObj2: $retunObj2")
}
