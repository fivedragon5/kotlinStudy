/*
    비트연산
        정수형 변수를 사람이 사용하는 10진법으로 연산하는 대신 2진법으로 연산할 수 있는 기능
    shl 왼쪽으로 이동
    shr 오른쪽으로 이동
    ushr 부호비트를 포함하여 이동
    
    and
    or
    xor
    
    inv
        비트 반전
 */
fun main() {
    var bitData: Int = 0b10000

    bitData = bitData or(1 shl 2)
    println(bitData.toString(2))

    var result = bitData and(1 shl 4)
    println(result.toString(2))

    println(result shr 4)

    bitData = bitData and((1 shl 4).inv())

    println((bitData xor(0b10100)).toString(2))


}