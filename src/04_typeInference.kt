/*
    1.타입 추론
    
    변수나 함수들을 선언할때, 연산이 이루어 질때 자료형을 코드에 명시하지 않아도
    코틀린이 자동으로 자료형을 추론해주는 기능
    
    대부분을 타입추론사용하여 생산산 증가
    
    2.함수

    특정한 동작을 하거나 원하는 결과값을 연산하는데 사용되는 기능
    
    3.단일 표현식 함수

     반환형의 타입추론이 가능함으로 반환값을 생략 할 수 있다.
 */

fun main() {
    var a = 1234
    var n = 1234L
    var c = 12.45
    var d = 12.45f

    //16, 2진수는 Integer..
    var e = 0xABC
    
    println(add(5, 6, 7))
    println(singleAdd(7, 7, 7))

}

fun add(a: Int, b: Int, c:Int): Int {
    return a + b + c
}

//단일 표현식 함수
fun singleAdd(a: Int, b: Int, c:Int) = a + b + c