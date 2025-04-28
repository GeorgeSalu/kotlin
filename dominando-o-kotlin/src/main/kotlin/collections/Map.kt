package collections

fun main() {

    val map1 = mapOf(
        Pair(1, "A"),
        Pair(2, "B")
    )

    val map2 = mapOf(
        1 to "A",
        2 to "B"
    )

    println(map1)
    println(map2)

    val v1 = map1[2]
    println(v1)
}