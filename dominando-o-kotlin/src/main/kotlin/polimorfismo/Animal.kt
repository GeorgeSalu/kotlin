package polimorfismo

fun main() {

    val a: Dog = Dog()
    a.run()
    a.eat()

    val b: Animal = Dog()

    if(b is Dog) {
        b.run()
        b.eat()
    }

}

abstract  class Animal {

    open fun eat() {
        println("eating...")
    }

}

class Dog: Animal() {

    fun run() {
        println("running...")
    }

    override fun eat() {
        println("dog eating...")
    }

}

class Cat: Animal() {

    fun sleep() {
        println("sleeping...")
    }

}