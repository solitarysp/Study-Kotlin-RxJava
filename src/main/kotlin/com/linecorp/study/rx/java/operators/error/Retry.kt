package com.linecorp.study.rx.java.operators.error

import io.reactivex.rxjava3.core.Observable

var index = 1;

fun main() {
    Observable.just(1, 2, 3)
        .map { mapData(it) }
            //retry 3
        .retry(3)
        .subscribe({
            // 1
            // 1 2 3
            // 1 1 2 3
            println(it)
        }, {
            println(it)
        })
}

fun mapData(it: Int): Int {
    if (it == 2 && index == 1) {
        index += 1;
        throw NullPointerException("null $it")
    }
    return it;
}
