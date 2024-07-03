// Lamda Expression adalah function yang tidak memiliki nama
// Function di Kotlin adalah first-Class citizen, artinya dianggap seperti tipe data lainnya

// Lamda akan menganggap baris terakhir di blok lamda sebgai hasil kembalian

fun toUpper(value: String) : String = value.toUpperCase()


fun main() {

    val contohLamda: (String, String) -> String = {
        fistName: String, lastName: String ->
        val result = "$fistName $lastName"
        result
    }

    val result = contohLamda("Rezky", "Eko")
    println(result)

    // kode it Pada LamdaExpression
    // penggunaan it itu pada function lamda harus memiliki 1 parameter

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Ardianto"))

    // method references

    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Rezkyekoard"))

}