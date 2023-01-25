/*
 1.형변환 함수 to자료형

   코틀린은명시적 형 변환 필요
    - 변환될 자료형을 개발자가 직접 지정함

   암시적 형 변환은 지원하지 않음
    - 변수를 할당할 시 자료형을 지정하지 않아도 자동으로 형변환 되는 형태
    
  2.배열
 */
fun main() {
    //형변환
    var a: Int = 54321
    var b: Long = a.toLong()

    //배열
    var intArr = arrayOf(1, 2, 3, 4, 5)
    
    //꺽쇠 안에는 배열에 할당할 자료형을 지정 Generic
    var nullArr = arrayOfNulls<Int>(5)

    println(intArr[2])

    intArr[2] = 8
    println(intArr[2])

}