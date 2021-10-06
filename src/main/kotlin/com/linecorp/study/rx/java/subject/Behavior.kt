package com.linecorp.study.rx.java.subject

import io.reactivex.rxjava3.subjects.BehaviorSubject


fun main() {
    //vi: Khi tiến hành observer, nó sẽ nhận được item cuối cùng trước khi observer và các item tiếp theo từ thời điểm observer
    //en: When conducting observer, it will get last item before observer and next items from observer time
    val source = BehaviorSubject.create<Int>()

    //  print 1 2 3
    source.subscribe {
        println("First: $it")
    }

    source.onNext(1)
    source.onNext(2)
    source.onNext(3)

    //  print 3 4
    source.subscribe {
        println("Second : $it")
    }
    source.onNext(4)
    source.onComplete()
}