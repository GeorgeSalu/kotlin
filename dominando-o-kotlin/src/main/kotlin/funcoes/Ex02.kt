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
    var sb = StringBuilder()

    for (c in str) {
        sb.append( "$c " )
    }

    val r = sb.toString()

    return if (maiusculo) {
       r.uppercase()
    } else {
        r
    }
}