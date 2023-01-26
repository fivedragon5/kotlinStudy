/*
    문자열을 다루는 법

 */
fun main() {
    var test1 = "Test.Kotlin.String"

    println(test1.length)
    println(test1.toLowerCase())
    println(test1.toUpperCase())

    var test2 = test1.split(".")
    println(test2)

    println(test2.joinToString())
    println(test2.joinToString("-"))

    println(test1.substring(5..10))

    var nullString: String? = null
    var emptyString = ""
    var blankString = " "
    var normalString = "A"

    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())

    println()

    //Blank 인식: Space, Tab, Line Feed, Carrige Return
    //눈에 직접적으로 보이지 않는 것들을 포함
    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())

    println()

    var test3 = "kotlin.kt"
    var test4 = "java.java"

    println(test3.startsWith("java"))
    println(test4.startsWith("java"))

    println(test3.endsWith(".kt"))
    println(test4.endsWith(".kt"))

    println(test3.contains("lin"))
    println(test4.contains("lin"))
}