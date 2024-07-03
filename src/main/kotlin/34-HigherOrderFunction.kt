// HighOrderFunction adalah Function yang menggunakan function sebagai parameter atau mengembalikan function



fun main() {

    // Contoh HighOrderFunction penggunaan lamda didalam parameter function
    fun hello(name: String, transformer: (String) -> String) : String {
        val nameTransform = transformer(name)
        return  "Hello $nameTransform"
    }

    // Penggunaan Lamda
    val lamdaUpper = {value: String -> value.toUpperCase()}
    println(hello("Eko",lamdaUpper))

    // Bisa juga kayak gini
    println(hello("Ardianto", {value: String -> value.toLowerCase()}))


    //Trailing Lamda -> Lamdanya di luar parameter
    val result = hello("Eko") { value: String ->
        value.toLowerCase()
    }
}