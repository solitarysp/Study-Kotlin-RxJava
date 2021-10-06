package com.linecorp.study.rx.java.subject

import io.reactivex.rxjava3.subjects.ReplaySubject

fun main() {
    //vi: Khi tiến hành observer, các item cũ sẽ được gửi lại cho observer mới
    //en: When conducting observer, the old items will be sent back to the new observer
    val source = ReplaySubject.create<Int>()

    //  print 1 2 3
    source.subscribe {
        println("First: $it")
    }

    source.onNext(1)
    source.onNext(2)
    source.onNext(3)

    //  print 1 2 3 4
    source.subscribe {
        println("Second : $it")
    }
    source.onNext(4)
    source.onComplete()
}