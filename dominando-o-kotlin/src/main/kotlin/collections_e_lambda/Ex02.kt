package collections_e_lambda

/**
 * EXERCÍCIO
 * --------
 *
 * Com case em um mapa que mapeia um nome de produto ao seu preço, encontre as respostas para as seguintes perguntas:
 * 1) Qual o maior preço?
 * 2) Qual o produto com o preço mais baixo?
 * 3) Qual a lista de produtos cujo preço é menor do que R$ 5?
 */
fun main() {

    val products = mapOf(
        "Alface" to 2.5,
        "Arroz" to 6.9,
        "Banana" to 4.8,
        "Sal" to 2.4
    )

    // 1
    val maxPrice = products
        .map { it.value }
        .max()

    println(maxPrice)

    // 2
    println(
        products
            .minBy { it.value }
            .key
    )

    // 3
    products
        .filter { it.value < 5 }
        .keys
        .forEach { println(it) }
}