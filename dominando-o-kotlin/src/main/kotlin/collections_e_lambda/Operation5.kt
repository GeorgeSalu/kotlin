package collections_e_lambda

/**
 * OBJETIVO
 * --------
 *
 * Obter a quantidade de pessoas cujo nome começa com a letra 'R'.
 */
fun main() {

    val count = Person
        .data()
        .filter { it.name.uppercase().startsWith("R") }
        .count()

    val count2 = Person
        .data()
        .count { it.name.uppercase().startsWith("R") }

    println(count)
    println(count2)
}