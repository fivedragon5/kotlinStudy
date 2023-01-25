/*
보통 변수가 선언 된 후 초기화 되지 않으면 기본값 or 값이 할당되지 않았다는 표시로 null인데

기본변수에 null을 허용하지 않음
변수에 값을 할당하지 않은채로 사용하면 문법 error 컴파일 단계에서 막아주면 nullpointException차단
*/ 
fun main() {
    var a: Int = 123
    println(a)
    var b: Int
    b = 456
    
    var c: Int? = null
    // 자료형 뒤에 "?" 을 붙이면 null을 허용하는 nullable 변수로 선언해 줄 수 있음
    // null인상태로 연산할 경우 nullpointException발생할 수 있음
    // lateinit, lazy속성 참고

    /*
     기본 자료형
     */

    var intValue:Int = 1234
    var longValue:Long = 1234L
    var intValueByHex:Int = 0x1af
    var intValueByBin = 0b101101

    var doubleValue:Double = 123.5
    var doubleValueWithExp:Double = 123.5e10 //지수표기법 가능

    var floatValue:Float = 123.5f

    //UTF-16 BE 로 관리 따라서 글자 하나하나가 16bit 2bytes로 관리
    
    var charValue:Char = 'a'
    var koranCharValue:Char = '가'

    // boolean
    var booleanValue:Boolean = true

    // string
    var stringValue = "test"
    var multiLineStringValue = """multiValue
        string
        test"""
}