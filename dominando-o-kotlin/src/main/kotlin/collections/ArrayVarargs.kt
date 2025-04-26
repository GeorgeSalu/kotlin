package collections

fun main() {

    println(sum(2, 5, 20, 30,4))

    val a = intArrayOf(2,3,4,6,7,3)
    println(sum(*a))
}

fun sum(vararg  values: Int): Int {
    var sum = 0
    values.forEach { sum += it }
    return sum
}

