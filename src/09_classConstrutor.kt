/*
    클래스의 생성자
    
    생성자
        새로운 인스턴스를 만들기위해 호출하는 특수한 함수
        인스턴스의 속성을 초기화
        인스턴스 생성시 특수한 기능을 수행

        init
            파라미터나 반환형이 없는 특수한 함수

        보조 생성자
            기본생성자 형태와 다르게 생성해주는 함수
 */

fun main() {

    var a = Person2("박보영", 1999)
    var b = Person2("정국", 1997)
    var c = Person2("장원영", 2004)

    var d = Person2("테스트")
    var e = Person2("테스트123")
    var f = Person2("테스트444")

}

class Person2(var name:String, val birthYear: Int) {
    init {
        println("안녕하세요, ${birthYear}년생 ${name}님이 생성 되었습니다.")
    }
    //보조 생성자
    constructor(name:String): this(name, 1997) {
        println("보조 생성자가 사용되었습니다.")
    }
}