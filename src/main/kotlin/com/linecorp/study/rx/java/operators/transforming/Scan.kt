package com.linecorp.study.rx.java.operators.transforming

import io.reactivex.rxjava3.subjects.PublishSubject

fun main() {
    val source = PublishSubject.create<Int>()
    source.scan { t1, t2 -> t1 + t2 }
        .subscribe {
            println(it)
        }
    // t1 =0 , t2=1
    source.onNext(1)
    // t1 =1 , t2=2
    source.onNext(2)
    // t1 =3 , t2=3
    source.onNext(3)
    // t1 =6 , t2=4
    source.onNext(4)
    // t1 =10 , t2=5
    source.onNext(5)

}
