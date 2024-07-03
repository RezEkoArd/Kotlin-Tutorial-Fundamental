
fun main() {

    fun sayHello(name: String = ""): String{
        if(name == "") {
            return  "Hello Bro"
        } else {
            return  "Hello $name"
        }
    }

    fun sayHello2 (name: String = ""): String{
        return when(name) {
            "" -> "Hello Bro!"
            else -> "Hello $name"
        }
    }

    println( sayHello())
    println( sayHello("Eko"))

    println( sayHello2())
    println( sayHello2("Ardi"))
}