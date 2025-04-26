package lambdas

fun main() {

    val r1 = sum(10, 5)
    println(r1)

    val f1 = fun (a: Int,b: Int): Int {
        return a + b
    }
    val r2 = f1.invoke(10, 5)
    println(r2)

    val r3 = f1(10, 5)
    println(r3)
}

fun sum(a: Int,b: Int): Int {
    return a + b
}