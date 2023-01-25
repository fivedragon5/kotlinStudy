/*
    고차함수
        함수를 마치 클래스에서 만들어낸 인스턴스 처럼 취급 하는 방법
        함수를 파라미터로 넘겨 줄 수도있고 결과값으로 반환 받을 수 있는 방법
        
    람다함수
    
 */
fun main() {
    b(::a)
    
    var c: (String) -> Unit = { str -> print("$str 람다함수")}
    b(c)
}

fun a (str: String) {
    println("$str 함수 a")
}

fun b (function: (String) -> Unit) {
    function("b가 호출한")
}