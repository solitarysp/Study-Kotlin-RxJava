package com.linecorp.study.rx.java.operators

import io.reactivex.rxjava3.subjects.AsyncSubject

fun main() {

    val asyncSubject = AsyncSubject.error<String>(NullPointerException())

    asyncSubject.subscribe (
        { println("Next") }
        ,{println("Error")},{
        println("Done")
    })
}