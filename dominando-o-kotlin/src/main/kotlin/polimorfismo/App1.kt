package polimorfismo

fun main() {

    val c = Coffee()
    c.prepare()

}

open class Drink {

    open fun prepare() {
        println("prepare drink")
    }

}

class Coffee: Drink() {

    override fun prepare() {
        super.prepare()
        println("prepare coffee")
    }

}