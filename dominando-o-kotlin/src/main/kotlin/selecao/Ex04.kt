package selecao

/*
* Exercicio
*
* Implemente uma calculadora capaz de executar as 4 operacoes basicas e que recebe os dados via teclado
* Tres informacoes devem ser passadas: o primeiro operando, a operacao matematica e o segundo operando
* */
fun main() {

    print("> ")
    val v1 = readln().toDouble()

    print("> ")
    val op = readln()[0]

    print("> ")
    val v2 = readln().toDouble()

    val r = when (op) {
        '+' -> v1 + v2
        '-' -> v1 - v2
        '*' -> v1 * v2
        '/' -> v1 / v2
        else -> 0
    }

    println("resultado: $r")

}