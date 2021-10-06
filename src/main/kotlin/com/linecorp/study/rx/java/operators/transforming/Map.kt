package com.linecorp.study.rx.java.operators.transforming

import io.reactivex.rxjava3.core.Observable

fun main() {
    val source = Observable.fromArray(
        Student("Thành", 21),
        Student("Nam", 22),
        Student("Hải", 22),
        Student("Tuấn", 21),
        Student("Tùng", 23)
    )

    //Thành
    //Nam
    //Hải
    //Tuấn
    //Tùng
    source.map { it.name }
        .subscribe {
            println(it)
        }
}
