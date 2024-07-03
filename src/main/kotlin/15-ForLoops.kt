fun main() {

    //For Array
    val names = arrayOf("Eko","Ardianto","Rezky")
    for (name in names){
        println(name)
    }

    // For Range

    for (value in 0..10){
        println(value)
    }

    for (value in 100 downTo 0 step 5){
        println(value)
    }

    // atau

    val ukuranArray = names.size - 1
    for (i in 0..ukuranArray) {
        println("Index ke $i = ${names.get(i)}")
    }

}