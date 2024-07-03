fun main () {

    // Array : TipeData yang berisi kumpulan data dengan tipe data yang sama

    // Operasi Array
    // Size : untuk mendapatkan panjang array
    // get(index) : mendapatkan data di posisi Index
    // [index] : mendapatkan data di posisi Index
    // set(index, value) : mengubah data di posisi Index
    // [index] = value : mengubah data di posisi Index

    val names: Array<String> = arrayOf("rezky", "eko", "ardianto")
    names[0] = "rudi"
    println(names[0])

    val nilai: Array<Int> = arrayOf(10,9,8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])


    // Array NUll

    val students: Array<String?>  = arrayOfNulls(5)
    students[0]= "Eko"
    students[1]= "Eko"
    students[2]= "Eko"
    students[3]= "Eko"
    students[4]= "Eko"
    println(students[0])
}