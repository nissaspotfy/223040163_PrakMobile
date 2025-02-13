package tugas1

class PersegiPanjang(private val panjang: Int, private val lebar: Int) {
    fun hitungLuas(): Int {
        return panjang * lebar
    }

    fun hitungKeliling(): Int {
        return 2 * (panjang + lebar)
    }
}

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Masukkan panjang dan lebar sebagai argumen!")
        return
    }

    val panjang = args[0].toIntOrNull()
    val lebar = args[1].toIntOrNull()

    if (panjang == null || lebar == null || panjang <= 0 || lebar <= 0) {
        println("Masukkan nilai panjang dan lebar yang valid!")
        return
    }

    val persegiPanjang = PersegiPanjang(panjang, lebar)
    println("Panjang: $panjang")
    println("Lebar: $lebar")
    println("Luas: ${persegiPanjang.hitungLuas()}")
    println("Keliling: ${persegiPanjang.hitungKeliling()}")
}