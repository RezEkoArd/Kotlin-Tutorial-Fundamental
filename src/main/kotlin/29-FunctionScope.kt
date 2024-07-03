// Function Scope adalah ruang linkup dimana sebuah function bisa diakses
// istilah nya adalah function didalam function

fun satu () {
    //error
    //sayHello()
}

fun dua () {
    //error
    //sayHello()
}

fun main() {
    fun sayHello(name: String) {
        println("Hello $name")
    }

    sayHello("Eko");
}