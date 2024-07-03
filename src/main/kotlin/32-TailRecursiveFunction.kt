// TailRecursiveFunction

// Syarat TailRecursiveFUnction
// - Tambahkan tailrec difunctionnya
// - Saat memanggil function dirinya sendiri hanya boleh memanggil function dirinya sendiri, tanpa embel embel operasi dengan data yang lain

fun main() {

    // Contoh recursive Function
//    fun display(value: Int) : Unit  {
//        println("Recursive $value")
//        if(value > 0){
//            display( value - 1)
//        }
//    }

    // Contoh penggunaan tail Recursive Function
    tailrec fun display(value: Int) : Unit  {
        println("Recursive $value")
        if(value > 0){
            display( value - 1)
        }
    }

    display(100)


    // Contoh tail recursive Function
    tailrec fun factorialRecursive(value:Int, total: Int = 1): Int {
        return  when (value) {
            1 -> total
            else -> factorialRecursive(value - 1, total * value)
        }
    }
}