package funcoes

/*
* Exercicio
*
* Escreva uma funcao que calcula a iadde humana equivalente de um cachorro, considere que cada ano que um chachorro vive
* corresponde a 7 anos de vida de um ser humano. o valor da idade deve ser fornecido via teclado
* */
fun main() {

    println(
        calculaIdadeCachorro(
            readln().toDouble()
        ).toInt()
    )

}

private fun calculaIdadeCachorro(idade: Double): Double {
    return idade * 7
}