package chap05.section4.personthis

open class Person {
    constructor(firstName: String) {
        println("[Person1] firstName: $firstName")
    }

    constructor(firstName: String, age: Int) {
        println("[Person2] firstName: $firstName, $age")
    }
}

class Developer : Person {
    constructor(firstName: String) : this(firstName, 10) {
        println("[Developer1] $firstName")
    }

    constructor(firstName: String, age: Int) : super(firstName, age) {
        println("[Developer2] $firstName, $age")
    }
}

fun main() {
    val sean = Developer("Sean")
}


