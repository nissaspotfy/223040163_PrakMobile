package tugas1

class IndeksNilaiMatkul {
    fun hitungIndeks(nilai: String): String {
        if (nilai.isBlank()) {
            return "Nilai harus diisi"
        }

        val angka = nilai.toIntOrNull()
        if (angka == null) {
            return "Nilai harus diisi"
        }

        return when {
            angka > 100 || angka < 0 -> "Nilai di luar jangkauan"
            angka >= 80 -> "A"
            angka >= 70 -> "AB"
            angka >= 60 -> "B"
            angka >= 50 -> "BC"
            angka >= 40 -> "C"
            angka >= 30 -> "D"
            else -> "E"
        }
    }
}

fun main() {
    val indeksNilai = IndeksNilaiMatkul()
    val dataUji = listOf("77", "110", "", "25")

    println("No | Input    | Output")
    println("------------------------")
    for ((index, nilai) in dataUji.withIndex()) {
        val inputDisplay = if (nilai.isEmpty()) "{kosong}" else nilai
        println("${index + 1}  | $inputDisplay    | ${indeksNilai.hitungIndeks(nilai)}")
    }
}
