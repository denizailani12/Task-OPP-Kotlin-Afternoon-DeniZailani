package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
        val namaDepan: String = "Deni"
        println("namaDepan: $namaDepan")

        val namaBelakang: String = "Zailani"
        println("namaBelakang: $namaBelakang")

        val umur: Int = 23
        println("Umur: $umur tahun")

        val single: String = "true"
        println("Single: $single")
    }



/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    var groupId = "GeekJenius"
    var groupMember = listOf("Deni","Diah","Firyal","Defri","Rofiq")
    var session = "Siang"

    println("=====Anggota Group Saya=====")
    println("Group ID = $groupId")
    println("Anggota Group = $groupMember")
    println("Sesi = $session")

    return Any()

}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val GeekJenius = listOf("Deni","Diah","Firyal","Defri","Rofiq","Bagas","Adiva","Haykal","Dian","Ananda","Rahmah")
    return listOf(GeekJenius[0])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Kelvin","Iffan", "Shania")
    val countOfGroup = arrayOf("Deni","Diah","Firyal","Defri","Rofiq","Bagas","Adiva","Haykal",
        "Dian","Ananda","Rahmah")

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("GeekJenius", listOf("Deni Zailani","Diah Nur Astanti","Defri Salwan",
        "Ahmad Rofiq","Firyal Wishal N"), "Afternoon A")

}