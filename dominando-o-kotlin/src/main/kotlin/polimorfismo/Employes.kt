package polimorfismo

fun main() {

    val a: Programmer = Programmer()
    a.work()

    val b: KotlinProgrammer = KotlinProgrammer()
    b.work()

    var c: Programmer = KotlinProgrammer()
    c.work()

    c = Programmer()
    c.work()

    var d: Programmer = KotlinProgrammer()
    var e: Programmer = Programmer()

    d.work()
    e.work()
}

abstract class Employee {

    abstract fun work()

}

open class Programmer : Employee() {

    override fun work() {
        println("Programmer working...")
    }

}

class KotlinProgrammer : Programmer() {

    override fun work() {
        println("Kotlin Programmer working...")
    }

}

class Teacher : Employee() {
    override fun work() {
        println("Teacher working...")
    }

}