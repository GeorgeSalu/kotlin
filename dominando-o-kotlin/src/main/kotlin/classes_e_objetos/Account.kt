package classes_e_objetos

class Account {

    var balance: Double = 0.0

    fun deposit(amount: Double) {
        balance += amount
    }

}