package enums

fun main() {

    val month: Month = Month.MAY

    println(month)
    println(month.numberOfMonth)
    println(month.name)
    println(month.ordinal)

    var nextMonth = month.next()
    println(nextMonth)

}

enum class Month(val numberOfMonth: Int) {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    fun next(): Month {
        return Month.values()
                .find { it.numberOfMonth == numberOfMonth+1 }
                ?: Month.JANUARY
    }

}