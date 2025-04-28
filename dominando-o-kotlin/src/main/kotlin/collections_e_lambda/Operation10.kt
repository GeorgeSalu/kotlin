package collections_e_lambda

/**
 * OBJETIVO
 * --------
 *
 * Procurar na lista uma pessoa com determinada idade. Retornar um booleano indicando se ela foi encontrada.
 */
fun main() {

    val existsAge = Person
        .data()
        // any -> se exite algum
        //.any { it.age == 19 }
        // all -> so retorna verdadeiro se existir em todos os elementos
        // none -> retorna verdeiro se ninguem da match com a condicao

    println(existsAge)
}