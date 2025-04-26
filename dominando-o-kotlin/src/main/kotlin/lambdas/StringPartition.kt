package lambdas

fun main() {

    val (f, s) = "aFGFKdsKKKpasTTsj".partition { it.isUpperCase() }

    println("First: "+f)
    println("Second: "+s)
}