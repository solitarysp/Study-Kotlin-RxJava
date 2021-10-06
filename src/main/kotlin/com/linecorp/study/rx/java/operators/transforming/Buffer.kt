package com.linecorp.study.rx.java.operators.transforming

import io.reactivex.rxjava3.subjects.PublishSubject

fun main() {
    val source = PublishSubject.create<Int>()
    source.buffer(2).subscribe{
        println("buffer : $it")
    }
    source.onNext(1)
    Thread.sleep(1000)
    source.onNext(2)
    Thread.sleep(1000)
    source.onNext(3)
    Thread.sleep(1000)
    source.onNext(4)
}