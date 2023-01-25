/*
    조건형 반복문
        while do..while

    범위형 반복문
        for
            in .. step, downTo
 */

fun main() {
    var a = 0

    while(a < 5) {
        println(a++)
    }

    println("for loop")
    for(i in 0..9) {
        print(i)
    }
    println("for loop next 3")
    for(i in 0..9 step 3) {
        println(i)
    }

    println("for loop down")
    for(i in 9 downTo 0) {
        print(i)
    }

    for(i in 'a'..'z') {
        print(i)
    }
}