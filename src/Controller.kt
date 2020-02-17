class Controller {

    val pilihan = mutableListOf<String>("BATU", "GUNTING", "KERTAS")
    var hasil = String()


    fun lawanPlayer(listener: Callback) {
        println("Masukkan pilihan Pemain 1 : ")
        var playerSatu = readLine()!!.toLowerCase()
        println("Masukkan pilihan Pemain 2 : ")
        var playerDua = readLine()!!.toLowerCase()
        println("Hasil : ")


        if (playerSatu.equals(playerDua)) {
            hasil = "Seri"
        } else if (playerSatu == "batu" && playerDua == "gunting" || playerSatu == "gunting" && playerDua == "kertas" ||
            playerSatu == "kertas" && playerDua == "batu"
        ) {
            hasil = "Player satu menang! "
        } else if (playerDua == "batu" && playerSatu == "gunting" || playerDua == "gunting" && playerSatu == "kertas" ||
            playerDua == "kertas" && playerSatu == "batu"
        ) {
            hasil = "Player Dua menang!"
        } else {
            hasil = "Input salah! Silahkan masukkan ulang "
        }
        listener.kirimNilaiBalik(hasil)
    }

    fun lawanKomputer(listener: Callback) {
        var komputer = pilihan.random()
        println("Masukkan pilihan Pemain  : ")
        var player = readLine()!!.toUpperCase()
        if (player.equals(komputer)) {
            hasil = "Seri $player dengan $komputer"
        } else if (player == "batu" && komputer == "gunting" || player == "gunting" && komputer == "kertas" ||
            player == "kertas" && komputer == "batu"
        ) {
            hasil = "Player menang! $player mengalahkan $komputer"
        } else if (player == "batu" && komputer == "gunting" || player == "gunting" && komputer == "kertas" ||
            player == "kertas" && komputer == "batu"
        ) {
            hasil = "Komputer menang! $komputer mengalahkan $player"
        }
    }

    fun cetakHasil(listener: Callback) {

    }


}
