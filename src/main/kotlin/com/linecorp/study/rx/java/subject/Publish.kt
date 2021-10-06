package com.linecorp.study.rx.java.subject

import io.reactivex.rxjava3.subjects.PublishSubject


fun main() {
    //vi: Sẽ nhận các data tiếp theo tại từ thời điểm tiến hành observer
    //en: will receive items from observer time
    val source = PublishSubject.create<Int>()

    //  print 1 2 3
    source.subscribe {
        println("First: $it")
    }

    source.onNext(1)
    source.onNext(2)
    source.onNext(3)

    //  print 4
    source.subscribe {
        println("Second : $it")
    }
    source.onNext(4)
    source.onError(NullPointerException())
    source.onComplete()

}