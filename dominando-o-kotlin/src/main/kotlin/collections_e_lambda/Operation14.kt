package collections_e_lambda

/**
 * OBJETIVO
 * --------
 *
 * Criar um mapa a partir da lista de pessoas, mapeando a primeira letra do nome à lista de pessoas cujo nome começa
 * com aquela letra.
 */
fun main() {

    Person
        .data()
        .groupBy({ it.name[0] }, { it.name })
        .forEach { (k,v) -> println("$k => $v") }
}