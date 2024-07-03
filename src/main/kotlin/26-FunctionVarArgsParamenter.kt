// VarArgs artinya variable Argument artinya datanya bisa menerima lebih dari satu input atau anggap saja array

// Contoh array
fun hitungTotal(values : Array<Int>) : Int {
    var hasil = 0

    for (value in values){
        hasil += value
    }
    return hasil
}

// Contoh varargs
fun hitungTotal2( vararg values: Int ) : Int {
    var total = 0

    for (value in values){
        total += value
    }

    return total

}


fun main() {
    val values = arrayOf(10,10,10,10)

    val result = hitungTotal(values)

    println(result)

    val result2 = hitungTotal2(10,10,10)
    println(result2)

}