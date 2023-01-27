/*
    변수의 고급기술
        var, val 차이

    상수 const
        기본 자료형만 가능
        컴파일 시점에 결정되어 절대 바꿀 수 없는 값
        클래스의 속성이나 지역변수로는 사용 X
        반드시 companion object 안에 선언하여 객체의 생성과 관계없이 고정적인 값으로만 사용 가능
        
    lateinit
        초기값을 할당은 나중에 할수 있는 키워드
        초기값 할당 전까진 변수를 사용할 수 없음(에러발생)
        기본 자료형에는 사용할 수 없음
        ::a.isInitialized 로 변수 초기화 여부 판별 가능
        
    lazy 지연 대리자 속성
        초기화를 자동으로 늦춰줌
        코드에서는 선언시 즉시 객체를 생성 및 할당하여 변수를 초기화하는 형태를 갖고 있지만
        실제 실행시에는 변수를 사용하는 시점에 초기화 과정을 진행함으로써 코드의 실행시간을 최적화 할 수 있는 코드

        
 */
fun main() {
    val foodCourt = FoodCourt()

    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)

    val a = LateInitSample()

    println(a.getLateInitText())

    a.text = "새로 할당한 값"

    println(a.getLateInitText())

    val number: Int by lazy {
        println("초기화를 진행합니다")
        7
    }

    println("코드를 시작 합니다")
    println(number)
    println(number)
}

class FoodCourt {
    fun searchPrice(foodName: String) {
        var price = when(foodName) {
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }
        
        println("${foodName}의 가격은 ${price}원 입니다")
    }
    
    companion object {
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}

class LateInitSample {
    lateinit var text: String
    fun getLateInitText(): String {
        if(::text.isInitialized) {
            return text
        }
        else {
            return  "기본값"
        }
    }
}