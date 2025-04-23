package selecao

fun main() {

    val n = 10

    val r = if (n % 2 == 0) {
        println("par")
        "par"
    } else {
        println("impar")
        "impar"
    }

    println(r)

}