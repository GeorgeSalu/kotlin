package collections_e_lambda

/**
 * EXERCÍCIO
 * --------
 *
 * A partir de uma lista de números distintos, crie um mapa que mapeia o número ao seu sucessor. Imprima o resultado
 * na tela de forma que os números estejam ordenados em ordem crescente.
 */
fun main() {

    val numbers = listOf(1, 7, 14, 62, 8, 12)
        .associateWith { it + 1 }
        .toSortedMap()

    println(numbers)
}