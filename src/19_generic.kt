/*
    재너릭 generic
        많은 기본 클래스에서도 사용되고 있음
        함수나 클래스를 선언할때 고정적인 자료형 대신 실제 자료형으로 대체되는 타입 파라미터를 받아 사용하는 방법

    타입 파라미터
        클래스 이름과 규칙이 같지만 일반적으로는 T를 사용하는것이 관례
        여러개의 재너릭을 사용할 경우 T,U,V를 사용하기도 하며
        특정한 슈퍼 클래스를 상속받은 클래스 타입으로만 제한하려면 <T: SuperClass> 명시
 */

fun main() {
    var a = A()
    a.shout()

    var b = B2()
    b.shout()

    var c = C()
    c.shout()

    UsingGeneric(A()).doShouting()
    UsingGeneric(B2()).doShouting()
    UsingGeneric(C()).doShouting()

    doShouting(B2())
}

fun <T: A> doShouting(t: T) {
    t.shout()
}

open class A {
    open fun shout() {
        println("${this.javaClass.name}가 소리쳐!")
    }
}

class B2 : A() {
    override fun shout() {
        println("${this.javaClass.name}가 소리침 ㅋ")
    }
}

class C : A() {
    override fun shout() {
        println("${this.javaClass.name}가 소리침 Yo")
    }
}

//타입 파라미터를 사용하여 캐스팅 없이 파라미터를 받을 수 있음
class UsingGeneric<T: A> (var t: T) {
    fun doShouting() {
        t.shout()
    }
}