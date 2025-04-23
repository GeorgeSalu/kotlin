package selecao

/*
* Exercicio
*
* Escreva um programa que, com base em uma idade fornecida, classifica a pessoa nos grupos abaixo
*
* crianca: 0 a 12 anos
* adolescente: 13 a 17 anos
* adulto: 18 a 65 anos
* senior: 66 ou mas anos
* */
fun main() {

    print("> ")
    val age = readln().toInt()

    if(age >= 0 && age <= 12) {
        println("crianca")
    } else if(age >= 13 && age <= 17) {
        println("adolescente")
    } else if (age >= 18 && age <= 65) {
        println("adulto")
    } else if (age >= 66 && age <= 120) {
        println("senior")
    } else {
        println("idade invalida")
    }

}