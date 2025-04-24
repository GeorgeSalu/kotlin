package heranca

open class Animal(
    val color: String
) {

    fun eat() {
        println("eating")
    }

}

class Dog(color: String): Animal(color) {

    fun bark() {
        println("au au")
    }

}

class Cat(color: String): Animal(color) {

    fun miau() {
        println("miau")
    }

}