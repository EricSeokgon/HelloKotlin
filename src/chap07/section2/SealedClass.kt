package chap07.section2

sealed class Result {
    open class Success(val message: String) : Result()
    class Error(cal code: Int, val message: String) : Result()
}

class Status : Result() //실드 클래스 상속은 같은 파일에서만 가능
class Inside : Result.Success("Status") //내부 클래스 상속

