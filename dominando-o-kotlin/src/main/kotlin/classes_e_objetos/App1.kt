package classes_e_objetos

fun main() {

    val a1 = Account()
    val a2 = Account()

    a1.balance = 100.0
    a2.balance = 1000000.0

    println(a1.balance)
    println(a2.balance)
}