/*
 클래스
    값과 그 값을 사용하는 기능들을 묶어 놓은건

  인스턴스
    클래스를 이용해서 만들어내는 서로 다른 속성을 객체를 지칭하는 용어
 */



fun main() {
    var a = Person("박보영", 1999)
    var b = Person("정국", 1997)
    var c = Person("장원영", 2004)

    a.introduce()
    b.introduce()
    c.introduce()


}

class Person(var name:String, val birthYear: Int) {
    fun introduce() {
        println("안녕하세요, ${birthYear}년생 ${name} 입니다.")
    }
}