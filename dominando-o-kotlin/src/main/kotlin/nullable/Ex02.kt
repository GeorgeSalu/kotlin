package nullable

/*
* Exercicio
*
* Escreva um programa que solicita um numero a um usuario, multiplica ele por 2 vez e subtrai 10. se o usuario
* digitar algo que nao possa ser convertido em um numero. o numero 2 deve ser assumido como padrão. o programa
* deve calcular o valor do numero e mostra-lo na tela em uma unica expressao
* */
fun main() {

    println(
        readln()
            .toIntOrNull()
            ?: 2
            .times(2)
            .times(2)
            .minus(10)
    )

}