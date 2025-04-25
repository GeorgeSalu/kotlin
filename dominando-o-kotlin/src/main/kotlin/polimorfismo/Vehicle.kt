package polimorfismo

fun main() {

    val vehicle = object : Vehicle{
        override fun drive() {
            println("driving...")
        }
    }

    vehicle.drive()

}

interface  Vehicle {
    fun drive()
}