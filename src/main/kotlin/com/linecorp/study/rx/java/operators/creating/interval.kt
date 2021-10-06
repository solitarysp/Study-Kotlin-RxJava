package com.linecorp.study.rx.java.operators

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {

    val asyncSubject = Observable.interval(1, TimeUnit.SECONDS)

    asyncSubject.subscribe (
        { println("Next $it") }
        ,{println("Error")},{
            println("Done")
        })
    Thread.sleep(10000)
}