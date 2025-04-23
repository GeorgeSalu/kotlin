package nullable

/*
* Exercicio
*
* Escreva um programa que mascara uma senha, substiuindo seus caracteres por '*' se a senha for nulo, a senha
* '1234' deve ser usada, a qual deve ser mascarada depois
* */
fun main() {

    val password: String? = null
    val defaultPassword = "1234"

    val mask = "".padEnd(password?.length ?: defaultPassword.length, '*')

    println(password)
    println(mask)
}