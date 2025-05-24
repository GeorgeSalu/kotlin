package br.com.secao6

fun main() {

    val cat = Animal("garfield", "cat", 10)
    println(cat.show())

    val dog = Animal("toto", "dog", 30)
    println(dog.show())

    cat.weight = 13
    println(cat.show())

}