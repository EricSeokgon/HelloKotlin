package chap04.section2

fun main() {
    print("Enter the number: ")
    var number = readLine()!!.toInt()
    var factorial: Long = 1

    while (number > 0) { // n * ... * 4*3*2*1
        factorial *= number
        --number
    }
    println("Factorial: $factorial")
}