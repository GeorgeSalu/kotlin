package exceptions

fun main() {

    // val x = throw IllegalArgumentException()

    val i: Int? = 10

    val d = i?.toDouble() ?: throw IllegalArgumentException()

    println(d)
}