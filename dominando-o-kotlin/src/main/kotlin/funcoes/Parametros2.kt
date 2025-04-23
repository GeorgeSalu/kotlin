package funcoes

fun main() {

    sayHello("pedro", 20)
    sayHello("maria", 15)
    sayHello("jose", 30)

}

private fun sayHello(name: String, temperatura: Int) {
    println("Hi, $name! Temperatura é $temperatura graus")
}