// Inline Function
// Inline Function adalah kemampuan di kotlin untuk mengubah High Order Function menjadi Inline FUnction
// cara kerjanya
// Dimana dengan Inline Function, Code didalam High Order Function akan di duplicate agar pada saat
// runtime , aplikasi tidak perlu membuat object lambda berulang ulang

inline fun hello(name: () -> String) : String {
    return  "Hello ${name()}"
}

// No Inline
// saat menandai bahwa function adalah inline, maka secara automatis semua parameter akan menjadi inline
// jika kita ingin memberi tahu jangan melakukan inline pada parameter, kita bisa
// menandai parameter tersebut dengan kata kunci noinline

inline fun sayHello (firstName: () -> String, noinline lastname: () -> String): String {
    return "Hello ${firstName()} ${lastname()}"
}

fun main() {
//    println(hello { "Eko" })
//    println(hello { "Kurniawan" })

    for (i in 0..100){
        println(sayHello({"Eko"}, {"Kurniawan"}))
    }
}