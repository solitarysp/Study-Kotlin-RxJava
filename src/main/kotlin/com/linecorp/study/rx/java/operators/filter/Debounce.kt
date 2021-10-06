package com.linecorp.study.rx.java.operators.filter

import io.reactivex.rxjava3.subjects.PublishSubject
import java.util.concurrent.TimeUnit

fun main() {
    val source = PublishSubject.create<Int>()
    source.debounce(1, TimeUnit.SECONDS)
        .subscribe {
            println(it)
        }
    //show
    source.onNext(1)
    Thread.sleep(3000)
    //not show
    source.onNext(2)
    Thread.sleep(1000)
    //not show
    source.onNext(3)
    Thread.sleep(1000)
    //show
    source.onNext(4)
    Thread.sleep(3000)
    //not show
    source.onNext(5)
    Thread.sleep(1000)
    source.onNext(6)
}
