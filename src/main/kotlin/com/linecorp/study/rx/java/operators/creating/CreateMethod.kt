package com.linecorp.study.rx.java.operators

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.AsyncSubject
import io.reactivex.rxjava3.subjects.BehaviorSubject

fun main() {
    val observable = Observable.create<String> {
        it.onNext("Thành")
    }
    val asyncSubject = AsyncSubject.create<Int>()
    val behaviorSubject = BehaviorSubject.create<Int>()

}