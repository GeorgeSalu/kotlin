package variables

/*
* Exercicio
*
* Solicite 3 informações ao usuario: nome, idade e peso, depois imprima uma frase que contenha essas informações
* */
fun main() {

    print("Nome : ")
    val nome = readln()

    print("Idade : ")
    val idade = readln().toInt()

    print("Peso : ")
    val peso = readln().toDouble()

    println("O seu nome é $nome. voce tem $idade anos e seu peso é $peso")
}