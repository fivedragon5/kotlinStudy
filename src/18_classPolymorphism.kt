/*
    클래스의 다형성 classPolymorphism
    
    down-casting
    'as' : 호환되는 자료형으로 변환해주는 캐스팅 연산자 즉시 자료형을 변환 및 반환해주면서 변수에 넣을 수 있음
    'is' : 변수가 자료형에 호환되는지를 먼저 체크한 후 변환 해주는 캐스팅 연산자
            조건문 내에서 사용되는 특징이 있음
    
 */
fun main() {
    var a = Drink()
    a.drink()
    
    //b는 Drink 변수에 Cola를 담았음으로 drink()를 호출하면 override된 drink가 호출됌
    //하지만 b는 Drink 변수 이므로 washDishes()를 호출 할 수 없음
    var b: Drink = Cola()
    b.drink()
    
    //is는 조건문 안에서만 잠시 다운캐스팅 됌
    if(b is Cola) {
        b.washDishes()
    }

//    b.washDishes() 호출 불가능

    //as를 사용하면 반환값 뿐만 아니라 변수 자체도 다운 캐스팅 됌 (b.washDishes() 호출 가능해짐)
    var c = b as Cola
    c.washDishes()
    b.washDishes()
}

open class Drink {
    var name = "음료"
    
    open fun drink() {
        println("${name} 마심")
    }
}

class Cola: Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}를 마심")
    }
    
    fun washDishes() {
        println("${type} 으로 설거지를 합니다")
    }
}