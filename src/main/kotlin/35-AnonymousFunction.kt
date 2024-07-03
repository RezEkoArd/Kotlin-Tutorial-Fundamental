// Anonymous Function

// Kadang kita  butuh membuat lamda yang se fleksibel function, dimana kita bisa mengembalikan hasil apapun
// untuk hal ini, bisa mengandalkan Anonymus Function
// Anonymous Function sebenernya mirip dengan lamnda, hanya cara membuatnya yang sedikit berbeda,
// masih menggunakan kata kunci func


fun main() {

    fun hello(name: String, transformer: (String) -> String) : String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    // Contoh anonymous Function
    val upper = fun(value: String) : String {
        if(value == "") {
            return "UPS"
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("Eko", upper))
    println(hello("", upper))

    //atau

    println(hello("Ardianto", fun(value: String) : String{
        return value.toLowerCase()
    }))
}