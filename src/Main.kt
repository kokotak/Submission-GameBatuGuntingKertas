class Main {
    companion object : Callback {
        @JvmStatic
        fun main(args: Array<String>) {

            do {
                var menu = Menu()
                menu.menuGame()
                print("Main lagi? Y/N")
                var lanjutMain = readLine()!!.toUpperCase()
            } while (lanjutMain == "Y")
        }

        override fun kirimNilaiBalik(hasil: String) {
            print(hasil)
        }
    }
}