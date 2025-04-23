package funcoes

fun main() {

    val r = calculate(20, 10)
    println(r)
}

private fun calculate(a: Int,b: Int): Int {
    val r = a + b
    return r
}