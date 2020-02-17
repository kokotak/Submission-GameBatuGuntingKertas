import kotlin.system.exitProcess

class Menu : Callback {
    var inputMenu = 0

    fun menuGame() {
        println("*********************************************")
        println(" Selamat Datang di Game Batu-Gunting-Kertas! ")
        println("*********************************************")
        println("  PILIH MENU : ")
        println("---------------------------------------------")
        println("   1. Pemain lawan Pemain")
        println("   2. Pemain lawan BOT")
        println("   3. Keluar")
        print("Masukkan pilihanmu : ")
        inputMenu = readLine()!!.toInt()

        when (inputMenu) {
            1 -> {
                var controller = Controller()
                controller.lawanPlayer(this)
            }
            2 -> {
                var controller = Controller()
                controller.lawanKomputer(this)
            }
            3 -> {
                println("Keluar game")
                exitProcess(0)
            }
        }
    }

    override fun kirimNilaiBalik(hasil: String) {
        print(hasil)
    }
}