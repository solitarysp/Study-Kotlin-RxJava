package com.linecorp.study.rx.java.operators.filter

import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.functions.Predicate
import io.reactivex.rxjava3.subjects.PublishSubject

fun main() {
    val source = PublishSubject.create<Int>()
    source.last(2).subscribe(Consumer { println(it) })

    source.onNext(1)
    source.onNext(2)
    source.onNext(2)
    source.onNext(5)
    source.onNext(6)
    source.onComplete()
}
