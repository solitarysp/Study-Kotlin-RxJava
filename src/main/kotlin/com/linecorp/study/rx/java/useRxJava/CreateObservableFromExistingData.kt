package com.linecorp.study.rx.java

import io.reactivex.rxjava3.core.Flowable


fun main() {
//vi: Tạo một observable từ một danh sách data có sẵn
    //en: Create observable  from một list item existing
    val obse=  Flowable.fromArray<Any>("Tuấn","Thành")

    //vi: thực hiện đăng ký 1
    //end:  subscriber 1
    obse.subscribe { s: Any ->
        println(
            "Hello $s!"
        )
    }
    //vi: thực hiện đăng ký 2
    //end:  subscriber 2
    obse.subscribe( { s: Any ->
        println(
            "Hello $s!"
        )
    },{},{
        println("Completed")
    })
    // Mỗi khi có đăng ký mới,
}


