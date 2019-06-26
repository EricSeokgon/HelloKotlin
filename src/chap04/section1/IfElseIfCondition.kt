package chap04.section1

fun main() {
    print("Enter the scor:")
    val score = readLine()!!.toDouble() //콘솔로부터 입력받음
    var grade: Char = 'F'

    if (score >= 90.0) {
        grade = 'A'
    } else if (score in 80.0..89.9) {
        grade = 'B'
    } else if (score in 70.0..79.9) {
        grade = 'C'
    }
    println("Score: $score, Grade: $grade")
}