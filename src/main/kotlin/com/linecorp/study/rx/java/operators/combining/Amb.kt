package com.linecorp.study.rx.java.operators.combining

import io.reactivex.rxjava3.subjects.BehaviorSubject

fun main() {
    val source1 = BehaviorSubject.create<Int>()
    val source2 = BehaviorSubject.create<Int>()
    val source3 = BehaviorSubject.create<Int>()
    val sourceAll = source1.ambWith(source2).ambWith(source3)
    //  print 2 2 2
    sourceAll.subscribe {
        println("$it")
    }
    source2.onNext(2)
    source1.onNext(1)
    source2.onNext(2)
    source3.onNext(3)
    source2.onNext(2)

}