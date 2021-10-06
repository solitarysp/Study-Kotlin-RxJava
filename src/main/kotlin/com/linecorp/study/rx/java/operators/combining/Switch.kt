package com.linecorp.study.rx.java.operators.combining

import io.reactivex.rxjava3.core.Observable

fun main() {
    val source = Observable.fromArray(1,2)
    var result = source.switchMap({ it->
        Observable.fromArray(5)
    },1);
    //  print 1 2 3 4 5 6 7 8 9
    result.subscribe {
        println(" $it")
    }
}