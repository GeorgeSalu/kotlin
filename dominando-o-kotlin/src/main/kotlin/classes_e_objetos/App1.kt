package classes_e_objetos

fun main() {

    val a1 = Account("1234-1", "joao")
    val a2 = Account("4445-5", "maria")
    val a3 = Account()
    val a4 = Account("8880-7", "Carlos", 1000.0)

    a1.deposit(2000.0)
    a2.deposit(150.0)
    a4.deposit(2000)

    a1.print()
    a2.print()
    a3.print()
    a4.print()
}