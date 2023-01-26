/*
    Data Class
        데이터를 다루는 데에 최적화된 클래스
        1. equals()
            내용의 동일성을 판단하는
        2.hashcode()
            객체의 내용에서 고유한 코드를 생성
        3.toStrinG()
            포함된 속성을 보기쉽게 표현해줌
        4.copy()
            객체를 복사하여 똑같은 내용의 새 객체를 만듬
            일부속성을 변경해서 복사 가능
        5.componentX()
            속성을 순서대로 반환함
            
    Enum Class
        열거형 클래스 보통 대문자로 기술
 */
fun main() {
    val a = General("보영", 212)

    println(a == General("보영", 212))
    println(a.hashCode())
    println(a)

    val b = Data("루다", 306)

    println(b == Data("루다", 306))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("아린"))
    println(b.copy(id = 618))
    
    val list = listOf(
        Data("보영", 212),
        Data("루다", 306),
        Data("아린", 618)
    )

    for((a,b) in list) {
        println("${a}, ${b}")
    }

    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleeping())

    state = State.EAT
    println(state.message)
}
class General(val name: String, val id: Int)

data class Data(val name: String, val id: Int)

enum class State(val message: String) {
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다");

    fun isSleeping() = this == State.SLEEP
}