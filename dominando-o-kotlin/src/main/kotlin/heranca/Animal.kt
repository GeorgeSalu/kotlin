package heranca

abstract class Animal(
    val color: String
) {

    fun eat() {
        println("eating")
    }

    protected fun sleep() {
        println("sleep")
    }

}

class Dog(color: String): Animal(color) {

    fun bark() {
        println("au au")
        sleep()
    }

}

class Cat(color: String): Animal(color) {

    fun miau() {
        println("miau")
        sleep()
    }

}