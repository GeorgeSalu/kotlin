package collections

fun main() {

    val s = sortedSetOf(1,2,3,4,4,3,3,2,5,7,8)
    println(s)

    val dogs = sortedSetOf(
        Comparator.comparing { it.name },
        Dog("D1"),
        Dog("D6"),
        Dog("D2"),
        Dog("D5"),
        Dog("D4")
    )

    println(dogs)
}