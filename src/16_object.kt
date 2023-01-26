/*
    오브젝트
        생성자 없이 객체를 직접 만들어 낼 수 있음
        싱글톤 패턴을 언어차원에서 지원
        최초 사용시 자동으로 생성
        이후에는 코드 전체에서 사용 가능
        프로그램이 종료되기 전까지 공통적으로 사용할 내용들을 묶어 만드는 것이 좋음
        companion Object
            클래스 안에 Object
            클래스 내부에서 별도에 영역에 고정적으로 존재하여 인스턴스를 생성하지 않아도 공용으로 사용가능한 속성이나 함수
 */
fun main() {
    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()

    println(Counter.count)
    
    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()
    a.vote()

    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("총 투표수 ${FoodPoll.total}")
}

object Counter {
    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
}

class FoodPoll (val name: String) {
    companion object {
        var total = 0
    }

    var count = 0

    fun vote() {
        total++
        count++
    }
}