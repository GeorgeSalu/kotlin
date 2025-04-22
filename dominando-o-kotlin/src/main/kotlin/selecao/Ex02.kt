package selecao

/*
* Exercicio
*
* Escreva um programa que recebe um valor fornecido pelo teclado e diz se ele par ou impar
* */
fun main() {

    print("> ")
    val x = readln().toInt()

    if (x % 2 == 0) {
        println("o numero é par")
    } else {
        println("o numero é impar")
    }

}