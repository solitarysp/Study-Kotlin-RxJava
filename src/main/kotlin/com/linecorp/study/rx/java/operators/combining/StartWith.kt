package com.linecorp.study.rx.java.operators.combining

import io.reactivex.rxjava3.core.Observable

fun main() {
    val source = Observable.fromArray(7,8,9)
    var result = source.startWithArray(4,5,6).startWithArray(1,2,3);
    //  print 1 2 3 4 5 6 7 8 9
    result.subscribe {
        println("First: $it")
    }
}