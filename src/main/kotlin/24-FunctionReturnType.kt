// Jika Funtion mengembalikan data, maka wajib untuk menuliskan tipe data tersebut

fun sum(a: Int, b: Int) : Int{
    val total = a + b
    return total
}

fun bagi(a: Int,b: Int): Int {
    if(b == 0){
        return 0
    } else {
        val result = a /b
        return  result
    }
}


fun main() {
    println(sum(10,10));
    val hasilSum = sum(100, 100)

    println(hasilSum)


    println(bagi(10, 2))
    val hasilBagi = bagi(100, 5)
    println(hasilBagi)


    println(bagi(100, 0))
}