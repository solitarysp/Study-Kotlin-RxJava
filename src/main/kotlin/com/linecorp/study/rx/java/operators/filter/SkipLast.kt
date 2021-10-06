package com.linecorp.study.rx.java.operators.filter

import io.reactivex.rxjava3.subjects.PublishSubject

fun main() {
    val source = PublishSubject.create<Int>()
    source.skipLast(2).subscribe {
            println(it)
        }

    source.onNext(1)
    source.onNext(2)
    source.onNext(2)
    //show
    source.onNext(5)
    source.onNext(6)
    source.onNext(2)
}
