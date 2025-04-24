package heranca

/*
* Exercicio
*
* Crie uma classe Device que representa um dispositivo que pode esta ligado ou desligado, crie metodos para ligar
* e desligar o dispositivo
* */
fun main() {

    val d1 = TV()
    d1.on()
    println(d1.isOn)

    val d2 = Telephone()
    println(d2.isOn)
}

abstract class Device {

    var isOn: Boolean = false
        private set

    fun on() {
        isOn = true
    }

    fun off() {
        isOn = false
    }

}

class TV : Device() {

}

class Telephone: Device() {

}