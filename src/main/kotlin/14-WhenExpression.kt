fun main() {

    // When expression sama dengan switch

    val examVal = 'D'

    when(examVal) {
        'A' -> {
            println("Amazing")
        }
        'B' -> {
            println("Good")
        }
        'C' -> {
            println("Not Bad")
        }
        'D' -> {
            println("Not Bad")
        }
        else -> println("Try Again Next Year")

    }


    // When Multiple Option
    val finalExam = "A"
    when (finalExam){
        "A","B","C" -> {
            println("Selamat Lulus")
        }
        else -> {
            println("Maaf Anda Tidak Lulus")
        }
    }

    //When Expression In

    val nilaiUjian  = 'A'
    val passValue = arrayOf('A','B','C')

    when (nilaiUjian) {
        in passValue -> println("Pass")
        !in passValue -> println("Try Again")
    }

    // When Expression Is (Mengecek Tipe Data)

    val name = "Eko"

    when(name){
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }


    // When Sebagai Pengganti if Else

    val exampleValue = 50

    when {
        exampleValue > 80 -> println("Good Job")
        exampleValue > 60 -> println("Not Bad")
        else -> println("Try Again")
    }

}