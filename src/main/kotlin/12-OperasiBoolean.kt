fun main() {
    // Operasi Boolean
    // &&   |   Dan
    // ||   |   Atau
    // !    |   Kebalikan

    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiEkstra = 60

    val isPassUjian = nilaiUjian > 75
    val isPassAbsen = nilaiAbsen > 75
    val isPassEkstra = nilaiAbsen > 75

    val lulusKelas = isPassAbsen && isPassUjian && isPassEkstra
//    val lulusKelas = (isPassAbsen && isPassUjian) && isPassEkstra
//    val lulusKelas = (isPassAbsen && isPassUjian) || isPassEkstra
    println(lulusKelas)
}