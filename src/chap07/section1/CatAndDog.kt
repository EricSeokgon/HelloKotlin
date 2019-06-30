package chap07.section1


open class Animal(val name: String)

class Dog(name: String, override var category: String) : Animal(name), Pet {
    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master {
    fun playWithPet(dog: Dog) {
        println("Enjoy with my dog.")
    }

    fun playWithPet(cat: Cat) {
        println("Enjoy woth my cat.")
    }
}

fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}

