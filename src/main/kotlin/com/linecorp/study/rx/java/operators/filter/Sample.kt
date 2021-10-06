package com.linecorp.study.rx.java.operators.filter

import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.subjects.PublishSubject
import java.util.concurrent.TimeUnit

fun main() {
    val source = PublishSubject.create<Int>()
    source.sample(3, TimeUnit.SECONDS).subscribe(Consumer { println(it) })

    for (i in 1..200) {
    Thread.sleep(100)
        source.onNext(i)
    }


    source.onComplete()
}
