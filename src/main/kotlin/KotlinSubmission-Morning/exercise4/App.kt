package id.infinitelearning.KotlinSubmission.exercise4

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    fun main() {
        println("Masukkan usia Anda:")
        val userInput = readLine()
        try {
            val age = userInput?.toInt()
            println("Usia Anda: $age tahun")
        } catch (e: NumberFormatException) {
            println("Mohon masukan angka yang benar untuk usia anda.")
        }
    }

