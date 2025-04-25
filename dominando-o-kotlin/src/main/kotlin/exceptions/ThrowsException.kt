package exceptions

fun main() {

    val account = BankAccount()

    try {
        account.deposit(-500.0)
    } catch (e: Exception) {
        println("Ops, invalid deposit: ${e.message}")
    }

    println(account.balance)

}

class BankAccount() {
    var balance: Double = 0.0
        private  set

    fun deposit(value: Double) {
        if (value < 0) {
            throw Exception("value cannot be negative")
        }
        balance += value
    }

    fun withdraw(value: Double) {
        balance -= value
    }
}