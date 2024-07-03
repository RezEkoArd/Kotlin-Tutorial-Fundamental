// Recursive Function salah satu penggunaannya digunakan untuk mengelola faktorial =
// Recursive Function adalah Function yang menggunakan function nya sendiri didalam function

// contoh pengunaan Faktorial menggunakan looping



fun main() {

    // Contoh penggunaan Faktorial menggunakan looping
    fun factorialLoop (value: Int) : Int {
        var result = 1;
        for (i in value downTo 1){
            result *= i
        }

        return  result
    }

    println(factorialLoop(10))

    // Contoh Pengunaan Faktorial menggunakan Recursive Function

    fun factorialRecursive( value: Int) : Int {
        return when (value) {
            1 -> 1
            else -> value * factorialRecursive(value - 1)
        }
    }

    println(factorialRecursive(10))
}