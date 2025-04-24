package classes_e_objetos

class Account(val accountNumber: String = "", val accountOwner: String = "") {

    var balance: Double = 0.0

    fun deposit(amount: Double) {
        balance += amount
    }

    fun print() {
        println("Number: $accountNumber; Owner: $accountOwner; Balance: $balance")
    }

}