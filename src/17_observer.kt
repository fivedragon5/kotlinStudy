/*
    감시자 observer
        이벤트 발생시 즉각적으로 기능수행
        
        1. A이벤트 수신
        2. B이벤트의 발생 및 전달
            이벤트를 받을 수 있는 인터페이스를 구현하여 넣음 <-- listner, callback, observer

 */

fun main() {
    EventPrinterAnonymous().start()
}

interface EventListener {
    fun onEvent(count: Int)
}

class EventCounter(var listener: EventListener) {
    fun count() {
        for(i in 1..100) {
            if(i % 5 == 0) listener.onEvent(i)
        }
    }
}

class EventPrinter: EventListener {
    override fun onEvent(count: Int) {
        println("$count 입니다.")
    }

    fun start() {
        //this: EventPrinter 객체 자신을 나타내지만 받는쪽에서 EventListener 요구했기 때문에 EventListener의 구현부만 넘겨주게 됌
        var eventCounter = EventCounter(this)
        eventCounter.count()
    }
}

//익명함수를 바로 넘길 수 있음
class EventPrinterAnonymous {
    fun start() {
        var counter = EventCounter(object: EventListener {
            override fun onEvent(count: Int) {
                println("$count-")
            }
        })
        counter.count()
    }
}