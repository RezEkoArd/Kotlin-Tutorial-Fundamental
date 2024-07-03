// Infix Notation adalah operasi yang biasa dilakukan di operasi matematika, dimana dia melakukan
// operasi tahap dua
// Hampir semua operasi matematika adalah infix notation

infix fun String.to(type: String) : String {
    if(type == "UP"){
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    val result = "Rezky" to "UP"

    // atau

    val hasil = "Rezky".to("low")

    println(result)
    println(hasil)
}