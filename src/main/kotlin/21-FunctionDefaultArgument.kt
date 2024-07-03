// Function pada Kotlin untuk paramenter itu wajib diisi
// bagaimana jika parameter itu kita seandainya tidak disi
// kita hanya perlu untuk membuat default parameter pada function

fun hello (firstname:String, lastname:String? = null) {
    if(lastname == null){
        println("Hello $firstname")
    } else {
        println("hello $firstname $lastname")
    }
}

fun main() {
    hello("Rezky")
}