package br.com.secao5

interface Veiculo {

    val automakerName: String

    fun start() {
        println("vruuuuum")
    }

    fun stop() {
        println("break noise")
    }

    fun getKmPerLiter(): Int {
        return 17
    }

    fun getDoors(): Int
}