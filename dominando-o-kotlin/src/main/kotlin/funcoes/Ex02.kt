package funcoes

/*
* Exercicio
*
* Escreva uma funcao que separa todoas os caracteres de uma string com um espaco em branco, esta funcao também deve receber
* um parametro opcional inicando se a string deve ser convertida para maiuscula
* */
fun main() {

    println(espaco("oi, tudo bem ?", true))

}

fun espaco(str: String, maiusculo: Boolean = false) : String {
    var r = ""

    for (c in str) {
        r += "$c "
    }

    r = r.trim()

    if (maiusculo) {
       r = r.uppercase()
    }
    return r
}