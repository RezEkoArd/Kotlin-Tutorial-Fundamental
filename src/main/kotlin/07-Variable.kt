fun main() {
    // Variable ada 2 mutable "bisa diubah" (var) dan immutable "tidak bisa diubah" (val)

        // Rekomendasi menggunakan val (immutable) daripada var
         val firstName : String = "Rezky Eko"
         val lastName = "Ardianto" // bisa menulis seperti secara explicit secara automatis

        // error jika mengubah variable
          // var lastName  = "Rezky Eko Ardianto"

        val fullname = "$firstName  $lastName"

        println(fullname)

    // Nullable Variable

    val city: String? = null

    // error karena city bisa null
    // println(city.length)

    // cara mengakses
    println(city?.length)


    // Variable Constant
//     const val APP = "Belajar Kotlin"
//     const val VERSION = "0.0.1"




}