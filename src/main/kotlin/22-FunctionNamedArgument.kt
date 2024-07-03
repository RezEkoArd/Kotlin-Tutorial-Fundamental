// handle function argument
// function name argument itu untuk mengetahui posisi parameter pada function
// supaya tidak ribet untuk menggunakan function yang memiliki parameter yang banyak


fun fullname(firstName: String, middleName: String, lastName: String) {
    println("Hello $firstName $middleName $lastName ")
}

fun main() {
    fullname(firstName = "Rezky", lastName = "Ardianto", middleName = "Eko")
}