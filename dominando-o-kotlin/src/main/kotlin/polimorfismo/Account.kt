package polimorfismo

fun main() {

    val account = Account(PersonName("carlos", "tosin"))
    account.deposit(1000.0)
    account.print()

}

class Account(private val owner: Nameable ) : Printable {

    private var balance: Double = 0.0

    fun deposit(value: Double) {
        balance += value
    }

    override fun print() {
        println("Balance for ${owner.fullName}: $balance")
    }

}

interface Nameable {
    val firstName: String
    val lastName: String
    val fullName: String
        get() = "$firstName $lastName"
}

interface  Printable {
    fun print()
}

class PersonName(override val firstName: String,override val lastName: String) : Nameable