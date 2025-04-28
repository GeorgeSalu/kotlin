package collections_e_lambda

/**
 * OBJETIVO
 * --------
 *
 * Procurar na lista uma pessoa com determinado nome. Retornar a idade dessa pessoa se ela for encontrada, caso
 * contrário retornar 0.
 */
fun main() {

    val person = Person
            .data()
            .find { it.name == "George" }
            ?.age
            ?: 0

    println(person)
}