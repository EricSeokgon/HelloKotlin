package chap10.section1

fun main() {
    val score: Int? = 32

    fun checkScore() {
        if (score != null) {
            println("Score: $score")
        }
    }

    fun checkScoreLet() {
        score?.let { println("Score: $it") }
        val str = score.let { it.toString() }
        println(str)
    }
    checkScore()
    checkScoreLet()
}