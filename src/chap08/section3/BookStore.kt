package chap08.section3

import java.util.*

fun main() {
    //books
    val booksName = arrayOf("java", "C", "C++", "kotlin", "c#", "html")
    val price = 200.00f
    val studentDiscount = .25f
    val teacherDiscount = .15f

    val scanner = Scanner(System.`in`)

    println("** 오리의 서점에 오신 걸 환영합니다.**")
    do {
        println(Arrays.toString(booksName))
        println("어떤 책을 원하시나요?")
        print("답변: ")

        val book = scanner.nextLine()

        if (booksName.contains(book.toLowerCase())) {
            println("선택하신 책은 $book 입니다. 가격은 \$200")
            println(
                "학생과 선생님인 경우에 할인을 적용하고 있습니다." +
                        "\n 당신의 직업은 무엇인가요(student, teacher, etc)?"
            )
            print("답변: ")
            val occupation = scanner.nextLine()

            when (occupation.toLowerCase()) {
                "student" -> calculatePrice(price, studentDiscount)
                "teacher" -> calculatePrice(price, teacherDiscount)
                else -> println(
                    "할인을 적용할 수 없습니다." +
                            "\n 최종 가격은 \$200 입니다."
                )
            }
        } else if (book == "exit" || book == "q") {
            break
        } else {
            println("죄송합니다. $book 의 재고가 없습니다.")
        }

    } while (true)
}


fun calculatePrice(orig: Float, x: Float): Unit {

    val result = orig - (orig * x)
    println("최종 가격은 \$$result 입니다.")
}