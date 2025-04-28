package collections

fun main() {

    val l1 = listOf<Int>(1,2,3,4,5)
    val l2: List<Int> = emptyList<Int>()
    val l3 = mutableListOf(1,2,3,5)
    val l4 = listOfNotNull(1,2,3,null,5,6)

    l3.add(10)

    l4.forEach { println(it) }
}