package pertemuan1

fun main() {
    var nama = "Kotlin"
    println(nama)

    var nama2: String = "nisa lucu"
    println(nama2)

    var umur: Int = 17
    println(umur)

    var umur2: Int = 17
    if (umur2 >= 18) {
        println("Anda sudah dewasa")

    } else {
        println("Anda masi bocil")
    }

    when (umur2) {
       in 0..17 -> println("anda masih bocil")
        else -> println("anda sudah dewasa")
    }
}


