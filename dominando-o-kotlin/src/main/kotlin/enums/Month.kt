package enums

fun main() {

    val month: Month = Month.MAY

    println(month)
    println(month.numberOfMonth)
    println(month.name)
    println(month.ordinal)

    var nextMonth = month.next()
    println(nextMonth)

    val month1 = Month.getEnumByNumberOfMonth(12)
    println(month1)

    val monthAugust = Month.valueOf("AUGUST")
    println(monthAugust)

    println(month.getTotalDays())
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

    fun getTotalDays(): Int {
        return when (this) {
            JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31
            FEBRUARY -> 28
            else -> 30
        }
    }

    companion object {
        fun getEnumByNumberOfMonth(numberOfMonth: Int): Month {
            return Month
                .values()
                .first { it.numberOfMonth == numberOfMonth }
        }
    }

}