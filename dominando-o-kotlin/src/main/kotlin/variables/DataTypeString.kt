package variables

fun main() {

    val s1: String = "abc"
    val s2: String = "def"

    //  val s1s2 = s1 + s2
    val s1s2 = "Soma: $s1$s2. O tamanho é: ${(s1+s2).length}"

    println(s1s2)
}