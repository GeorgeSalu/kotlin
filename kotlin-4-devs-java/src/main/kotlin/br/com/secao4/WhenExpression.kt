package br.com.secao4

fun main() {

    val pizzasOrdered = 1

    when (pizzasOrdered) {
        0 -> println("not hungry")
        1 -> println("hungry")
        2 -> println("very hungry")
        else -> println("are you sure")
    }

    when (pizzasOrdered) {
        0 -> println("not hungry")
        1, 2 -> println("hungry")
        3 -> println("very hungry")
        else -> println("are you sure")
    }

    when (pizzasOrdered) {
        Math.abs(pizzasOrdered) -> println("ordere 0 or more pizzas")
        else -> println("ordered les than 0")
    }

    when (pizzasOrdered) {
        0 -> println("we need orders")
        in 1..4 -> println("go some orders")
        in 5..9 -> println("business is up")
        else -> println("are you sure")
    }

    when {
        pizzasOrdered <= 0 -> println("none ordered")
        pizzasOrdered % 2 == 1 -> println("odd number ordered")
        pizzasOrdered % 2 == 0 -> println("even number ordered")
    }

}