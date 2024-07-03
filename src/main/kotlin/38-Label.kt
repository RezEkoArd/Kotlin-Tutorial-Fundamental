// Label adalah penanda
// penanda label ini bisa di gunakan dengan menggunakan break, continue dan return

fun labelBreak() {
    loopI@ for(i in 1..10){
        loopJ@  for (j in 1..10){
            if(i > 5){
                break@loopI
            }

            println("$i * $j =  ${i * j}" )


        }
    }
}

fun labelContinue() {
    loopI@ for(i in 1..10){
        loopJ@  for (j in 1..10){
            if(i == 5){
                continue@loopI
            }
            println("$i * $j =  ${i * j}" )
        }
    }
}

fun main() {

   fun test(name:String, operation:(String) -> String): Unit {
       
   }

}