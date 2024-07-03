fun main() {
    // Tipe Data Range : data array dengan angka berurutan, misal 1 sampai 1000 ataupun kelipatan

    // contoh membuatnya 0..10  = Range dari 0 sampai 10
    // contoh membuatnya 1..100  = Range dari 1 sampai 100

    // Operasi Range
    // count() : Mendapatkan total data di Range
    // constains(value) : Mengecek apakah terdapat value tersebut
    // first : Mendapatkan nilai pertama
    // last : Mendapatkan nilai terakhir
    // step: Mendapatkan nilai kenaikan

    // Range Naik
    val range = 1..100

    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)


    //Range Terbalik
    val rangeTerbalik = 100 downTo 1

    println(rangeTerbalik.count())
    println(rangeTerbalik.contains(50))
    println(rangeTerbalik.contains(200))
    println(rangeTerbalik.first)
    println(rangeTerbalik.last)
    println(rangeTerbalik.step)


    //Range dengan ketentuan step
    val range1 = 0..100 step 2
    val range2 = 100 downTo  0 step 2


}