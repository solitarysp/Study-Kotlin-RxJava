package com.linecorp.study.rx.java.operators.combining

import io.reactivex.rxjava3.subjects.BehaviorSubject

fun main() {
    val source1 = BehaviorSubject.create<Int>()
    val source2 = BehaviorSubject.create<Int>()
    val source3 = BehaviorSubject.create<Int>()
    val sourceAll = source1.mergeWith(source2).mergeWith(source3)
    //  print 1 2 3
    sourceAll.subscribe {
        println("$it")
    }
    source1.onNext(1)
    source2.onNext(2)
    source3.onNext(3)

}