/*
    함수의 argument
        1.default argument
            fun deliveryItem(name: String, count: Int = 1, destination: String = "집")
                파라미터를 넘기지 않을경우 설정된 값으로 셋팅

        2.name argument
            deliveryItem("선물", destination = "친구집")
                해당 함수를 사용할때 파라미터의 이름을 지정해서 넣는 방법

        3.variable number of arguments (vararg)
            개수가 지정되지 않은 파라미터 라는 특징이 있고 다른 파라미터랑 같이 사용할 경우 맨 마지막에 선언 해줄것

    infix 함수

    오버로딩 overloading
        같은 Scoper 안에서 같은 이름의 함수를 여러개 만들 수 있는 기능
            파라미터 의 자료형, 갯수가 다르면 다르게 동작 가능
    

 */
fun main() {
    read(7)
    read("ㅏㅏㅏ")
    
    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("노트북", 30, "학교")
    
    deliveryItem("선물", destination = "친구집")

    sum2(1,2,3,4,5,6,7,8,9,10)

    println(6 multiply 4)

    println(6.multiply(4))
}

fun read(x: Int) {
    println("x입니다")
}
fun read(x: String) {
    println("x")
}
fun deliveryItem(name: String, count: Int = 1, destination: String = "집") {
    println("${name}, ${count}개를 ${destination}에 배달하였습니다.")
}
fun sum2(vararg numbers: Int) {
    var sum = 0
    for(n in numbers) {
        sum += n
    }
    println(sum)
}

infix fun Int.multiply(x: Int): Int = this * x