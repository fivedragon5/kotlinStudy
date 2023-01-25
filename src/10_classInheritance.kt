/*
    상속이 필요한 경우
        1. 이미 존재하는 클래스를 새로운 속성추가나 함수를 확장해야 할경우
        2. 여러 클래스들이 있는데 공통 기능을 뽑을때
    
    Open
        클래스가 상속될 수 있도록 클래스 선언시 붙여줄 수 있는 키워드
        
    상속에 대한 규칙
        1. 서브 클래스는 수퍼 클래스에 존재하는 속성과 같은 이름의 속성을 가질 수 없음
        2. 서브클래스가 생성될 떄는 반드시 수퍼클래스의 생성자까지 호출 되어야 함
 */

fun main() {
    var a = Animal("별이", 5, "개")
    var b = Dog("별이", 5)

    a.introduce()
    b.introduce()
    
    b.bark()

    var c = Cat("루이", 2)

    c.meow()
}

open class Animal(var name:String, var age:Int, var type:String) {
    fun introduce() {
        println("저는 ${name}이고 나이는 ${age}입니다. 타입은 ${type}입니다.")
    }
}

//생성자에서 이름과 나이를 받긴 하지만 클래스의 자체 속성으로 만들어주는 var을 붙이지 말고 일반 파라미터로 받아 Animal 클래스의 생성자에 직접 넘겨줄것
class Dog(name:String, age:Int) : Animal (name, age, "개") {
    fun bark() {
        println("멍멍")
    }
}

class Cat(name:String, age:Int) : Animal (name, age, "고양이") {
    fun meow() {
        println("야옹")
    }
}