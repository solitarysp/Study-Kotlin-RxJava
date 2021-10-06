package com.linecorp.study.rx.java.operators.transforming

import io.reactivex.rxjava3.core.Observable

fun main() {
    val source = Observable.fromArray(
        Student("Thành", 21),
        Student("Nam", 22),
        Student("Hải", 22),
        Student("Tuấn", 21),
        Student("Tùng", 23))

       source . groupBy {
           // group by age
            it.age
        }.flatMap {
            return@flatMap Observable.just(it.toList())
        }
            .subscribe {
                it.subscribe { it2 ->
                    println(it2)
                }
            }
}
data class Student(val name: String, val age: Int) {

}