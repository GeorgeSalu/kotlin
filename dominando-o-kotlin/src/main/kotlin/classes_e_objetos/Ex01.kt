package classes_e_objetos

/*
* Exercicio
*
* Crie a classe CharGeneretor, capaz de gerar aleatoriamente um caracter dentro de um intervalo fornecido
* no momento da criação do objeto
* */
fun main() {

    val g = CharGenerator(min='A', max='Z')

    println(g.next())
    println(g.next())
    println(g.next())

}

class CharGenerator(
    val min: Char,
    val max: Char
) {

    fun next() = (min..max).random()

}