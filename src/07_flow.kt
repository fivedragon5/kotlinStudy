/*
    흐름제어와 논리 연산자
    
    lable
     다중 반복문에 이름을 붙여 제어 가능
 */
fun main() {

    loop@for (i in 1..10) {
        for(j in 1..10) {
            if(i == 1 && j == 4) break@loop
            println("i : $i, j : $j")
        }
    }

}