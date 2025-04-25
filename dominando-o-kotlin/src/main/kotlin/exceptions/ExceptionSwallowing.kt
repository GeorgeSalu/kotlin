package exceptions

fun main() {
    val bankAccount = BankAccount()
    try {

        bankAccount.withdraw(300.0)
        bankAccount.withdraw(500.0)
    } catch (e: Exception) {

    }

    println(bankAccount.balance)
}