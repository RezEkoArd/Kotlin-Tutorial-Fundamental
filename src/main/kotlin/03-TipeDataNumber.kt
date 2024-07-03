fun main () {

    //Tipe Data Number (Byte, Short, Int, Long)
    var age: Byte = 30
    var age1: Short = 200
    var sample: Long = 200000000L
    println(age)
    println(age1)
    println(sample)
    // Harus menggunakan L di akhir jika ingin menggunakan Long sama seperti Float


    //Tipe Data Number Floating Point (Float, Double)
    var value: Float =  98.98F
    // Harus menggunakan F di akhir jika ingin menggunakan FLoat jika tidak maka akan dibaca Double
    var radius: Double = 243225163.155
    println(value)
    println(radius)


    //Tipe Data Literals (masukan angka yang bukan desimal seperti Hexadesimal dan Binary)
    var binary: Int = 0b01010101 //Contoh penggunaan Binary
    var hexadecimal: Int = 0xff //Contoh penggunaan HexaDecimal
    var decimal: Int = 222 //Contoh penggunaan Decimal

    println(binary);
    println(hexadecimal);


    //Tipe Data Number Underscore (fungsinya hanya untuk separator supaya tau berapa nilai nol nya)
    var price: Long = 9_000_000_000L; // ini 900.000
    println(price);

    // Tipe Data Conversion
    var number: Int = 280;

    var priceInt: Int = price.toInt();
    var numberShort: Short = number.toShort();

    println(priceInt)
    // Kena overFlow (nilainya karena tidak cukup dengan tipe data lainnya maka akan mengulang dari -0 lagi)

    println(numberShort)
}