 fun main() {

     //Tipe Data String ada dua Jenis ( "" , """)

//     var firstName : String = "Rezky Eko"
//     var lastName : String = "Ardianto"
//     var fullName : String = "Rezky Eko Ardianto"

//     println(firstName)
//     println(lastName)
//     println(fullName)

     var address : String = """ 
         |Street Not Yet Done
         |Province Subang
         |Country Indonesia
     """.trimMargin()

     // atau

     var address2 : String = """ 
         >Street Not Yet Done
         >Province Subang
         >Country Indonesia
     """.trimMargin(">")

     // trimMargin = untuk menggabungkan suatu Karakter, contoh address dan address2 hasilnya sama aja
     println(address)
     println(address2)


     // Cara Menggabungkan 2 String menggunakan (+)

     var namaDepan: String = "Rezky Eko"
     var namaBelakang: String = "Ardianto"
     var namaLengkap: String = namaDepan + " " + namaBelakang

     println(namaLengkap)

     // String Template

     var firstName : String = "Rezky"
     var lastName : String = "Ardianto"
     var fullName : String = "$firstName $lastName"
     var desc: String = "total $fullName char = ${fullName.length}"

     println(fullName)
     println(desc)
 }
