package com.linecorp.study.rx.java.subject

import io.reactivex.rxjava3.subjects.AsyncSubject
import io.reactivex.rxjava3.subjects.BehaviorSubject


fun main() {
    //vi: Chỉ nhận được giá trị cuối cùng trước khi onComplete
    //en: Only get last value before onComplete
    val source = AsyncSubject.create<Int>()

    //  print 4
    source.subscribe {
        println("First: $it")
    }

    source.onNext(1)
    source.onNext(2)
    source.onNext(3)

    //  print 4
    source.subscribe {
        println("Second : $it")
    }
    source.onNext(4)
    source.onComplete()
}