/*
    1.조건문
      when은 switch와 비슷
      하나의 변수를 여러개의 값과 비교 할 수 있음
 */
fun main() {
    
//    var a = 11
//
//    if (a > 10) {
//        println("a는 10 보다 크다")
//    }
//    else {
//        println("a는 10보다 작거나 같다.")
//    }
//
//    if (a is Int) {
//        println("a는 int")
//    }

    doWhen(1)
    doWhen("Fivedragons")
    doWhen(30L)
    doWhen(1.2)
    doWhen("KoH")

    doWhenUpdate("fisdafjasdif")

}

fun doWhen (a: Any) {
    when(a) {
        1 -> println("정수 1 입니다.")
        "Fivedragons" -> println("코틀린 강좌")
        is Long -> println("Long 타입 입니다.")
        !is String -> println("String 타입이 아닙니다.")
        else -> println ("어떤 조건도 만족하지 않습니다.")
    }
}

fun doWhenUpdate (a: Any) {
    var result = when(a) {
        1 -> "정수 1 입니다."
        "Fivedragons" -> "코틀린 강좌"
        is Long -> "Long 타입 입니다."
        !is String -> "String 타입이 아닙니다."
        else -> "어떤 조건도 만족하지 않습니다."
    }
    println(result)
}