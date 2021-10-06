package com.linecorp.study.rx.java.operators.combining

import io.reactivex.rxjava3.core.Observable

fun main() {
    var result =
        Observable.fromArray(1, 2, 3)
            .zipWith(
                Observable.fromArray(5, 2), { it, it2 -> it + it2 }
            ).zipWith(
                Observable.fromArray(5, 2), { it, it2 -> it + it2 }
            )
    result.subscribe({
        println(it)
    })
}