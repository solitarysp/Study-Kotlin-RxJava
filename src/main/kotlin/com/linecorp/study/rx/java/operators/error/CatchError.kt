package com.linecorp.study.rx.java.operators.error

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.BehaviorSubject

fun main() {
 //   onErrorReturn()

  //  onErrorResumeNext()
}

private fun onErrorResumeNext() {
    val source = BehaviorSubject.create<Int>()

    //  print 1 2 3
    source
        .onErrorResumeNext { error ->
            println(error.message)
            return@onErrorResumeNext Observable.just(1, 2);
        }
        .subscribe {
            println("Data: $it")
        }

    source.onError(NullPointerException("Test"))
}

private fun onErrorReturn() {
    val source = BehaviorSubject.create<Int>()

    //  print 1 2 3
    source
        .onErrorReturn { error ->
            println(error.message)
            return@onErrorReturn 1;
        }
        .subscribe {
            println("Data: $it")
        }

    source.onError(NullPointerException("Test"))
}