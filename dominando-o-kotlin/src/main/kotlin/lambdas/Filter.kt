package lambdas

fun main() {

    val s1 = "fsd65jkhl5jkf09823fjkhjk0938tjkfhsa908e23yd2189678"
    val s2 = s1.filter { it.isLetter() }
    println(s2)

    val s3 = s1.filterIndexed { i, c ->
        val digit = c.isDigit()
        if (digit) {
            println("found digit '$c' position '$i'")
        }
        return@filterIndexed digit
    }

    println(s3)
}