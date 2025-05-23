package br.com.secao4

fun main() {

    var x = 0
    while (x < 10) {
        println("x = $x")
        x += 3
    }

    do {
        println("x = $x")
        x -= 3
    } while (x > 0)

    for (item in 1..10) {
        print("$item, ")
    }

    for (ch in "Erudio") {
        println(ch)
    }
}