/*
    리스트
        데이터를 코드에서 지정하는 순서대로 저장
        데이터를 모아 관리하는 컬렉션 클래스를 상속받는 서브 클래스중 가장 단순한 형태
        여러개의 데이터를 원하는 순서로 넣어 관리하는 형태
        2가지 형태가 있음
            1. List<out T>
                생성시에 넣은 객체를 대체, 추가, 삭제 할 수 없음
            2. MutableList<T>

 */
fun main() {
    val a = listOf("사과", "딸기", "배")
    println(a[1])

    for(fruit in a) {
        println("$fruit:")
    }

    println()

    val b = mutableListOf(6, 3, 1)
    println(b)
    b.add(4)
    println(b)

    b.add(2, 8)
    println(b)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)
}