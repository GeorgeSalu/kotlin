package enums

/**
 * EXERCÍCIO
 * ---------
 *
 * Crie 2 enums: Role (user, moderator, admin) e Level (basic, medium, high). Cada Role deve ter um Level associado
 * e um método chamado canDelete(), que deve retornar um booleano indicando se o Role tem permissão de exclusão
 * (apenas admins têm essa permissão).
 */
fun main() {

    println(Role.ADMIN.level)
    println(Role.ADMIN.canDelete())

}

enum class Role(val level: Level) {
    USER(Level.BASIC),
    MODERATOR(Level.MEDIUM),
    ADMIN(Level.HIGH);

    fun canDelete() = this == ADMIN
}

enum class Level {
    BASIC, MEDIUM, HIGH
}