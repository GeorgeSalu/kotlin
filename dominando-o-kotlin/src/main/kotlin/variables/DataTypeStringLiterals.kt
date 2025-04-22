package variables

fun main() {

    val s1 = "O rato roeu\na \$roupa do\nrei de \"roma\"."

    val s2 = """
        O rato roeu
        a roupa do 
        rei de "roma"
    """.trimIndent()

    println(s1)
    println()
    println(s2)

}