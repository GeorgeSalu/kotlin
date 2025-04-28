package collections

import java.util.Objects

fun main() {

    val dogs = setOf(
        Dog("D1"),
        Dog("D2"),
        Dog("D2"),
        Dog("D3"),
        Dog("D4"),
        Dog("D4")
    )

    println(dogs)
}

class Dog(private val name: String) {
    override fun toString() = "Dog(name=$name, hashCode=${hashCode()})"

    override fun hashCode(): Int {
        return Objects.hash(name)
    }

    override fun equals(other: Any?): Boolean {
        return if(other is Dog) {
            this.name == other.name
        } else {
            false
        }
    }
}