package funcoes

fun main() {

    sayHello("pedro")
    sayHello("pedro", "tudo bem")

}

private fun sayHello(name: String = "Desconhecido",message: String = "") {
    println("Hi, $name ! $message")
}