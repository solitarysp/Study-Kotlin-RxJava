package com.linecorp.study.rx.java

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableEmitter

fun main() {
    var itEmit: ObservableEmitter<String>? = null;
    // Create new observable
    val observable = Observable.create<String> {
        // get ref instance of Emitter
        itEmit = it;
    }
  /*  val observable = Observable.create<String> {
        it.onNext("1")
    }*/

    // subscribe
    observable.subscribe {
        println("Data: $it")
    }
    // new 2 thread emit data
    Thread {
        for (i in 0..15) {
            itEmit?.onNext("${i}")
            Thread.sleep(1000)
        }
    }.start()
    Thread {
        for (i in 15..30) {
            itEmit?.onNext("${i}")
            Thread.sleep(1000)
        }
    }.start()
    Thread.sleep(10000)
}
