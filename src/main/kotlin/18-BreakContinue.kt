fun main() {
    // Break : Kata kunci yang bisa digunakan dalam di seluruh perulangan, digunakan untuk menghentikan Perulangan
    // Continue: digunakan untuk menghentikan perulangan yang berjalan dan langsung melanjutkan ke perulangan selanjutnya


    // Break
    var i = 0
    while (true) {
        println("Break Me $i")
        i++
        if(i > 100){
            break
        }
    }

    //Continue
    for (o in 1..100){
        if(o % 2  == 1) {
            continue
        }
        println(o)

    }
}