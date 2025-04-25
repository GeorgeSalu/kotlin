package exceptions

fun main() {

    val account = BankAccount()
    account.deposit(-500.0)
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