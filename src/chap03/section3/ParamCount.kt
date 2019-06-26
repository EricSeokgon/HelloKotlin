package chap03.section3

fun main() {
    //매개변수 없는 람다식
    //noParam({ "Hello Wolrd!" })
    //noParam { "Hello Wolrd!" } //위와 동일 결과, 소괄호 생략가능

    //매개변수가 1개 있는 람다식
    //oneParam({a->"Hello World! $a"})
    //oneParam{a->"Hello World! $a"} //위와 동일한 결과, 소괄호 생략가능
    //oneParam{"Hello World! $it"} //위와 도잉ㄹ한 결과, it으로 대체 가능

    //매개변수가 2개 있는 람다식
    //moreParam { a, b -> "Hello Wolrd! $a $b" } //매개변수 이름 생략 불가

    //1인자와 함께 람다식을 사용하는 경우
    withArgs("Args1", "Args2", { a, b -> "Hello World! $a $b" })
    //2withArgs() 함수의 마지막 인자가 람다식인 경우 소괄호 바깥으로 분리 가능
    withArgs("Args1", "Args2") { a, b -> "Hello World! $a $b" }
}

fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}

//매개변수가 2개 있는 람다식이 moreParam() 함수의 매개변수 out으로 지정됨
fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}

//매개변수가 1개 있는 람다식이 oneParam() 함수의 매개변수 out으로 지정됨
fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

//매개변수가 없는 람다식이 noParam 함수의 매개변수 out으로 지정됨
fun noParam(out: () -> String) = println(out())
