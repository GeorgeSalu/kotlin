package classes_e_objetos

class Account(number: String = "", owner: String = "") {

    val accountNumber: String = number
    val accountOwner: String = owner
    var balance: Double = 0.0

    fun deposit(amount: Double) {
        balance += amount
    }

    fun print() {
        println("NUmber: $accountNumber; Owner: $accountOwner; Balance: $balance")
    }

}