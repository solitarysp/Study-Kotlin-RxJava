package com.linecorp.study.rx.java.operators

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.Callable

fun main() {

    val asyncSubject = Observable.fromArray(0, 1, 2, 3, 4)
    val asyncSubject2 = Observable.fromCallable(object : Callable<Int> {
        override fun call(): Int {
            return 1;
        }
    })

    asyncSubject.subscribe(
        { println("Next $it") }, { println("Error") }, {
            println("Done")
        })
}