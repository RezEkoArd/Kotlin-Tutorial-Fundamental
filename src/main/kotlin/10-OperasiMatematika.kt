fun main() {
    // Operasi Matematika ( + , - , * , / , % )

    val result = 10 / 2
    println(result) // hasilnya integer

    val result1 = 10.0 / 3
    println(result1) // hasilnya double


    val result2 = 10 + 10 / 2
    println(result2) // hasilnya 15


    // Augmented Assignments
    // a = a + 10   |   a+=10
    // a = a - 10   |   a-=10
    // a = a * 10   |   a*=10
    // a = a / 10   |   a/=10
    // a = a % 10   |   a%=10

    var total: Int = 0

    var barang1 = 100
    //total = total + barang1;
    total+= barang1;

    var barang2 = 200
    //total = total + barang2;
    total+= barang2;

    var barang3 = 300
    //total = total + barang3;
    total+= barang3;

    println(total)

    // Unary Operator
    // ++     |     a = a + 1
    // --     |     a = a - 1
    // -      |     Negative
    // +      |     Positive
    // !      |     Boolean Kebalikan

    total++  // total = total + 1
    println(total)


}