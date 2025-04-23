package estrutura_repeticao

/*
* Exercicio
*
* Imprimir na tela a tabuada de um numero de 1 a 10. o numero deve ser fornecido pelo usuario
* */
fun main() {

    print("> ")
    val n = readln().toInt()
    val m = 10

    for (x in 1..m) {
        println("$n x $x = ${n * x}")
    }

}