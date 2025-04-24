package properties

/*
* Exercicio
*
* Crie uma classe Account para representar uma conta bancaria. esta classe deve ter uma propriedade balance para armazenar
* o saldo da conta, quando uma conta é criada, ela pode opcionalmente conter um saldo inicial, o qual não pode ser inferior
* a 0. além disso. o saldo so pode ser alterado atraves do metodo deposit e withdraw(), responsaveis pelos depositos e saques
* na conta, respectivamente
* */
fun main() {

    val account = Account(100.0)

    account.deposit(1000.0)
    account.withdraw(100.0)
    account.withdraw(500.0)

    println(account.balance)

}

class Account(balance: Double = 0.0) {

    init {
        require(balance >= 0)
    }

    var balance: Double = balance
        private set

    fun deposit(amount: Double) {
        require(amount >= 0)
        balance += amount
    }

    fun withdraw(amount: Double) {
        require(amount >= 0)
        balance -= amount
    }

}