/*
    오버라이딩과 추상화
    
    오버라이딩
        이미 구현이 끝난 함수의 기능을 서브클래스에서 변경해야 할때
        
    추상화
        형식만 선언하고 실제 구현은 서브클래스에 일임할때 사용
          
    인터페이스
        서로다른 기능을들 여러개에 물려주어야 할때 사용

        추상함수로만 이루어저 있어야 하지만
        코틀린에서는 인터페이스에서는 속성, 추상함수, 일반함수 모두를 가질 수 있음
        다만 추상함수는 생성자를 가질 수 있고 인터페이스는 생성자를 가질 수는 없으며
        인터페이스에서 구현부가 있는 함수 -> open 함수로 간주
        인터페이스에서 구현부가 없는 함수 -> abstract 함수로 간주
        별도에 키워드가 없어도 포함된 모든 함수를 서브클래스에서 구현 및 재정의가 가능함
        한번에 여러 인터페이스를 상속 받을 수 있으므로 좀더 유연한 설계가 가능해진다.
 */
fun main() {
    var t = Tiger()
    t.eat()

    var r = Rabbit()
    r.eat()
    r.sniff()

    var d = interfaceDog()
    d.eat()
    d.run()
}

open class Animal2 {
    open fun eat() {
        println("음식을 먹습니다.")
    }
}

class Tiger: Animal2() {
    override fun eat() {
        println("고기를 먹습니다.")
    }
}

abstract class Animal3 {
    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : Animal3() {
    override fun eat() {
        println("당근을 먹습니다")
    }
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        print("음식을 먹습니다.")
    }
}

class interfaceDog : Runner, Eater {
    override fun run() {
        print("달리는 중입니다.")
    }

    override fun eat() {
        print("먹는 중입니다.")
    }
}

