package enums

fun main() {

    println(Operation.PLUS.apply(40,30))
    println(Operation.MINUS.apply(40,30))

}

enum class Operation {
    PLUS {
        override fun apply(n1: Int, n2: Int): Int {
            return n1 + n2
        }
    },
    MINUS {
        override fun apply(n1: Int, n2: Int): Int {
            return n1 - n2
        }
    };

    abstract fun apply(n1: Int,n2: Int): Int

}