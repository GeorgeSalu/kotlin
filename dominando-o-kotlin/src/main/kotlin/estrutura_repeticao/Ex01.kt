package estrutura_repeticao

/*
* Exercicio
*
* Imprimir na tela a tabuada de um numero de 1 a 10. o numero deve ser fornecido pelo usuario
* */
fun main() {

    print("> ")
    val n = readln().toInt()

    var i = 1
    while (i <= 10) {
        println("$n x $i = ${n * i}")
        i++
    }

}