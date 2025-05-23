package br.com.secao4

/*
Given positive integer `n` implement a function which returns a list numbers from `1` to `100`. However for multiples of
three list should contain word `Fizz` instead of the number and for the multiples of five list should contain
word `Buzz`. For numbers which are multiples of both three and five list should contain `FizzBuzz` word.

fizzBuzz(5) // [1, 2, "Fizz", 4, "Buzz"]
fizzBuzz(16) // [1, 2, "Fizz", 4, "Buzz", 5, "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz", 16]
* */

fun fizzBuzz(n: Int): List<String> {
    val list = mutableListOf<String>()

    for (it in 1..n) {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        list.add(item)
    }
    return  list
}

fun fizzBuzz2(n: Int): List<String> {
    val list = mutableListOf<String>()

    (1..n).forEach {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        list.add(item)
    }
    return list
}