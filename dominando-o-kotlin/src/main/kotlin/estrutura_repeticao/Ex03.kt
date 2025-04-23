package estrutura_repeticao

import kotlin.random.Random

/*
* Exercicio
*
* Crie um jogo de adivinhacao numerica. o computador deve sortear um numero aleatorio dentro de um intervalo e voce
* deve tentar descobri-lo, a cada tentativa o programa diz se o numero é maior ou menor do que o numero tentado. o
* jogo acaba quando o numero tentado for o numero correto
* */
fun main() {

    val secret = Random.nextInt(0, 101)
    var playing = true
    var n = 0

    while (playing) {
        print("> ")
        n = readln().toInt();

        when {
            n > secret -> println("o numero sorteado é menor")
            n < secret -> println("o numero sorteado é maior")
            else -> playing = false
        }
    }

    println("parabens! voce acertou o numero era $n")
}