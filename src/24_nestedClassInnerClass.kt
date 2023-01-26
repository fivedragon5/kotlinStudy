/*
    중첩클래스와 내부클래스
    
    중첩클래스 NestedClass
        하나의 클래스가 다른 클래스의 기능과 강하게 연관되어 있다는 의미를 전달하기 위해 만들어진 형식
        형태만 내부에 존재할뿐 실직적으로는 서로 내용을 직접 공유할 수 없는 별개의 클래스다

    내부 클래스 InnerClass
        중첩클래스에 내부에 inner 혼자서 객체를 만들순 없고 외부 클래스의 객체가 있어야지만 생성과 사용이 가능한 클래스
        외부 클래스의 속성과 함수를 사용할 수 있음
 */
fun main() {
    Outer.Nested().introduce()

    val outer = Outer()
    val inner = outer.Inner()
    inner.introduceInner()
    inner.introduceOuter()

    outer.text = "Changed Outer Class"
    inner.introduceOuter()
}

class Outer {
    var text = "Outer Class"

    class Nested {
        fun introduce() {
            println("Nested Class")
        }
    }
    inner class Inner {
        var text = "Inner Class"

        fun introduceInner() {
            println("Inner Class")
        }

        fun introduceOuter() {
            println(this@Outer.text)
        }
    }
}