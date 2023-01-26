/*
    null 값을 처리하는 방법?
    
    ?. null safe operator
        참조 연산자를 실행하기 전에 먼저 객체가 null 인지 확인부터 하고 객체가 null 이라면 구문 실행 X
    ?: elvis operator 
        객체가 null이아니라면 그대로 실행하지만 null 이라면 연산자 우측 실행
    !!. npn-null assertion operator
        참조 연산자를 사용할때 null 여부를 컴파일시 확인하지 않도록 하여 런타임시 nullpointException을 발생하게 하도록하여
        의도적으로 방치하는 연산자
        
    변수에 동일성 체크 하는 방법
        동일성
            1.내용의 동일성 ( == )
                메모리상의 서로 다른곳에 할당된 내용이 같다면 동일한것으로 간주
                코틀린의 모든 클래스가 내부적으로 상속받는 Any라는 최상위 클래스의 equals() 함수가 반환하는 Boolean 값으로 판단
                커스텀 class는 equals을 구현 해주어야 함
            2.객체의 동일성 ( === )
                서로 다른 변수가 메모리상의 같은 객체를 가리키고 있을떄만 동일하다고 간주
 */
fun main() {
    var a: String? = "asdasd"

    a?.run{
        println(toUpperCase())
        println(toLowerCase())
    }

    println(a?.toUpperCase())
    println(a?:"default".toUpperCase())
    println(a!!.toUpperCase())

    var q = Product("콜라", 1000)
    var w = Product("콜라", 1000)
    var e = q
    var r = Product("사이다", 1000)

    println(q == w)
    println(q === w)

    println(q == e)
    println(q === e)

    println(q == r)
    println(q === r)

}

class Product(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Product) {
            return other.name == name && other.price == price
        }
        else {
            return false
        }
    }
}