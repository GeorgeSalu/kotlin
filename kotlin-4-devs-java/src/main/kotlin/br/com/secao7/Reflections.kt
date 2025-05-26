package br.com.secao7

fun main() {

    val person = Person("Stan", "Lee")

    val kClass = person::class

    println("Simple name completed = $kClass")
    println("Simple name = ${kClass.simpleName}")

    for(fields in kClass.members) {
        println("Property name = $fields")
    }
}