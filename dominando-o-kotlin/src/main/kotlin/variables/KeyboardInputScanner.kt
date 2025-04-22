package variables

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    print("> ")
    val n1 = scanner.nextInt()

    print("> ")
    val n2 = scanner.nextInt()

    println("Resultado: ${n1 + n2}")
}