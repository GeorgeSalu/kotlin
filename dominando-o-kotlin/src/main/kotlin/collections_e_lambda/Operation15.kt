package collections_e_lambda

/**
 * OBJETIVO
 * --------
 *
 * Criar um mapa a partir da lista de pessoas, mapeando a primeira letra do nome à quantidade de pessoas cujo nome
 * começa com aquela letra.
 */
fun main() {

    Person
        .data()
        .groupingBy { it.name[0] }
        .eachCount()
        .forEach { (k, v) -> println("$k => $v") }
}