// Extension function adalah kemampuan menambahkan function pada tipe data yang sudah ada

fun String.hello() : String {
    return "Hello $this"
}

fun String.printHello() : Unit = println("Hello $this")

fun main() {
    val name = "Eko"

    println(name.hello())

    "Rezky".printHello()
}