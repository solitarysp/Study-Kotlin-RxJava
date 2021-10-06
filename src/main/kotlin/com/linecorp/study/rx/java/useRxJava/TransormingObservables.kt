package com.linecorp.study.rx.java

import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Flowable.fromArray
import io.reactivex.rxjava3.core.Observer

fun main() {
    Flowable.fromArray<Int>(1,2,3,4,5,6,7,8,9).skip(2).take(5).filter { a -> a > 0 }
        .subscribe(
            {
                println("$it ")
            }
        )
}
