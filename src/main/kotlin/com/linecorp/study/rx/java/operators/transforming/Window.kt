package com.linecorp.study.rx.java.operators.transforming

import io.reactivex.rxjava3.subjects.PublishSubject
import java.util.concurrent.TimeUnit

fun main() {
    val sourceCount = PublishSubject.create<Int>()
    sourceCount.window(2)
        .subscribe {
            it.subscribe({ it2 ->
                println("${it.hashCode()}  $it2")
            })
        }
    sourceCount.onNext(1)
    sourceCount.onNext(2)
    sourceCount.onNext(3)
    sourceCount.onNext(4)
    sourceCount.onNext(5)
println("==========sourceTime")
    val sourceTime = PublishSubject.create<Int>()
    sourceTime.window(3,TimeUnit.SECONDS)
        .subscribe {
            it.subscribe { it2 ->
                println("${it.hashCode()}  $it2")
            }
        }
    sourceTime.onNext(1)
    Thread.sleep(1000)
    sourceTime.onNext(2)
    Thread.sleep(1000)
    sourceTime.onNext(3)
    Thread.sleep(1000)
    sourceTime.onNext(4)
    Thread.sleep(1000)
    sourceTime.onNext(5)
    Thread.sleep(1000)
    sourceTime.onNext(6)

}
