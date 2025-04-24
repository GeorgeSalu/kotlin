package heranca

fun main() {

    val person1 = Person("Pedro", "Oliveira")
    val person2 = Person("Pedro", "Oliveira")

    println(person1)
    println(person2)
    println(person1 == person2)

    val person3 = person2.copy()
    println(person3)
}

data class Person (
    val firstName: String,
    val lastName: String,
) {
    val age: Int = 10
}