fun main() {
    print("Masukkan nilai: ")
    val nilai = readLine()?.toIntOrNull() ?: 0

    val grade = when {
        nilai in 85..100 -> "A"
        nilai in 70..84 -> "B"
        nilai in 60..69 -> "C"
        nilai in 0..59 -> "D"
        else -> "D"
    }

    println("Nilai Anda: $grade")
}

//85-100 = A
//70-84 = B
//60-69 = C
//0-59 = D