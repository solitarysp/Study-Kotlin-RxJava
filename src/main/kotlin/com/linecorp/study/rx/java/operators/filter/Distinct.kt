package com.linecorp.study.rx.java.operators.filter

import io.reactivex.rxjava3.subjects.PublishSubject

fun main() {
    val source = PublishSubject.create<Int>()
    val sourceDistinct = source.distinct()
    sourceDistinct.subscribe {
            println(it)
        }

    //show
    source.onNext(1)
    // show
    source.onNext(2)
    //not show
    source.onNext(2)
    // show
    source.onNext(5)
    // show
    source.onNext(6)

    sourceDistinct.subscribe {
        println("It2 : $it")
    }
    // show for it2
    source.onNext(2)
}
