package collections_e_lambda

/**
 * OBJETIVO
 * --------
 *
 * Criar uma String com os nomes das pessoas separadas por um hífen.
 */
fun main() {

    val names = Person
                    .data()
                    .joinToString(separator = "-") { it.name }

    println(names)
}