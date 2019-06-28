package chap05.section4

open class A {
    open fun f() = println("A Class f()")
    fun a() = println("A class a()")
}

interface B {
    fun f() = println("B Interface f()") //인터페이스는 기본적으 open임
    fun b() = println("B Interface b()")

}

class C : A(), B { //쉼표(,)를 사용해 클래스와 인터페이스를 지정
    //컴파일되려면 f()가 오버라이딩되어야 함
    override fun f() = println("C Class f()")

    fun test() {
        f()
        b()
        super<A>.f()
        super<B>.f()
    }
}

fun main() {
    val c = C()
    c.test()
}