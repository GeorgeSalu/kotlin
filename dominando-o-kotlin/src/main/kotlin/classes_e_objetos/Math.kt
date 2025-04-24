package classes_e_objetos

fun main() {

    println(Math.sum(20, 10))

}

class Math {
    companion object {
        fun sum(a: Int,b: Int) = a + b
    }
}