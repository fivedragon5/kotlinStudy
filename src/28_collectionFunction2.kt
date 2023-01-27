/*
    컬렉션 함수 2
        데이터의 조작을 더욱 수월하게 만들어줌 기억해두면 나중에 편함
    associateBy
        아이템에서 key를 추출하여 map으로 변환하는 함수
    groupBy
        key가 같은 아이템끼리 배열로묶어 map으로 만드는 함수
    partition
        아이템에 조건을 걸어 두 컬렉션으로 나누어주는 함수
    flatMap
        아이템마다 만들어진 컬렉션을 합쳐서 반환하는 함수
    getOrElas
        인덱스 위치에 아이템이 있으면 아이템을 반환하고 아닌경우 지정한 기본값을 반환하는 함수
    zip
        컬렉션 두 개의 아이템을 1:!로 매칭하여 새 컬렉션을 만들어 줌
        리스트의 아이템 갯수는 작은 컬렉션을 따라감
 */
fun main() {
    data class Person(var name: String, val birthYear: Int)
    
    var personList = listOf(
        Person("유나", 1992),
        Person("조이", 1996),
        Person("츄", 1999),
        Person("유나", 2003)
    )

    println(personList.associateBy { it.birthYear })
    println(personList.groupBy { it.name })

    val (over98, under98) = personList.partition { it.birthYear > 1998 }

    println(over98)
    println(under98)

    var numbers = listOf(-3, 7, 2, -10, 1)
    println(numbers.flatMap { listOf(it * 10, it + 10) })
    println(numbers.getOrElse(1) { 50 })
    println(numbers.getOrElse(10) { 50 })

    var names = listOf("A", "B", "C", "D")

    println(names zip numbers)
}