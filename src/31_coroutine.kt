/*
    코루틴 coroutine
    
    GlobalScope
        프로그램 어디서나 제어, 동작이 가능한 기본 범위
        
    CoroutineScope
        특정한 목적의 Dispatcher를 지정하여 제어 및 동작이 가능한 범위
        Dispatcher
        Dispatchers.Default 기본적인 백그라운드 동작
        Dispatchers.IO      I/O에 최적화 된 동작    
        Dispatchers.Main    메인(UI) 스레드에서 동작
        
        launch, async 반환값이 있는지의 여부에 따라 다름
        launch
            반환값이 없는 Job 객체
        async
            반환값이 있는 Deffered 객체

        delay(milisecondL Long)
        	milisecond 단위로 루틴을 잠시 대기시키는 함수

        Job.join()
        	Job의 실행이 끝날떄까지 대기하는 함수
        Deferred.await()
        	Defferred의 실행이 끝날때까지 대기하는 함수
            결과 반환

        cancel시키는법 2가지
        	1. 코루틴 내부의 delay() 함수 또는 yield() 함수가 사용된 위치까지 수행된 뒤 종료
            2. cancel()로 인해 속성인 isActive가 false가 되므로 이를 확인하여 수동으로 종료

        withTimeoutOrNull
        	제한시간안에 수행되면 결과값 그렇지 않으면 null


 */
import kotlinx.coroutines.*

fun main() {
//     val scope = GlobalScope

//     scope.launch {
//         for(i in 1..5) {
//             println(i)
//         }
//     }

    runBlocking {
        var a = launch {
            for(i in 1..5) {
                println(i)
                delay(10)
            }
        }

        var b = async {
            "async 종료"
        }

        println("async 대기")
        println(b.await())

        println("launch 취소")
        a.cancel()
        println("launch 종료")
    }

    runBlocking {
        var result = withTimeoutOrNull(50) {
            for(i in 1..10) {
                println(i)
                delay(10)
            }
            "Finish"
        }

        println(result)
    }
}