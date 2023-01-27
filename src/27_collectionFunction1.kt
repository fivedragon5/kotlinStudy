/*
    컬렉션 함수
        컬렉션 또는 배열에 일반함수 또는 람다 함수를 사용하여 for문 없이도 아이템을 순회하며 참조하거나
        조건을 걸고, 구조의 변경까지 가능함
        NoSuchElementException 주의
 */
fun main() {
    var nameList = listOf("박수영", "김지수", "김다현", "신유나", "김지우")
    
    nameList.forEach{( print(it + " "))}
    println()
    
    println(nameList.filter { it.startsWith("김") })

    println(nameList.map { "이름 : " + it })

    println(nameList.any{ it == "김지연" })
    println(nameList.all{ it.length == 3 })
    println(nameList.none{ it.startsWith("이") })

    println(nameList.first{ it.startsWith("김")})
    println(nameList.last{ it.startsWith("김")})
    println(nameList.count(){ it.contains("지")})
}