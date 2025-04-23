package selecao

fun main() {

    val x = 10

    val s = when {
        x > 0 -> "positivo"
        x < 0 -> "negativo"
        else -> "zero"
    }

    println(s)
    
}