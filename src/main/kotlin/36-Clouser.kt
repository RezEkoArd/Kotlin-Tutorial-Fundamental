// Clouser adalah kemampuan sebuah function, lambda atau anonymous function berinteraksi dengan data data disekitarnya
// dalam scope yang sama
// harap gunakan fitur clouser ini dengan bijak saat membuat aplikasi

fun main() {
    var counter: Int = 0

    val lambdaIncrement = {
        println("Lambda Incremet")
        counter++
    }

    val anonymousIncrement = fun (){
        println("Anonymous Function Incremet")
        counter++
    }

    fun functionIncrement(){
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}