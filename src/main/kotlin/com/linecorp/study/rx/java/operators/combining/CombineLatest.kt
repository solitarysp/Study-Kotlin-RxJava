package com.linecorp.study.rx.java.operators.combining

import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.combineLatest(
        Observable.just("Lê Thành"),
        Observable.just(24),
        { a, b ->
            println("name: $a")
            println("age: $b")
        }
    ).subscribe()

    val list: List<Observable<*>> = arrayListOf(Observable.just(1), Observable.just("2"))
    Observable.combineLatest(
        list
    ) {
        // 1
        println(it.get(0))
        // 2
        println(it.get(1))
    }.subscribe()

}