package lambdas

fun main() {

    val f: (Int) -> Int = { n: Int ->
        val d = n * 2
        println("new value $d")
        d
    }

    f(4)
    f(20)
}