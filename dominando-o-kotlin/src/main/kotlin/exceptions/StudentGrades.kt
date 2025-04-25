package exceptions

fun main() {

    val avg = StudentGrades()
        .add(3.0)
        .add(5.5)
        .add(7.0)
        .average()

    println(avg)
}

class StudentGrades {
    private var sum: Double = 0.0
    private var numberOfGrades: Int = 0

    fun add(grade: Double): StudentGrades {

        if (grade !in 0.0..10.0 ) {
            throw IllegalArgumentException("Invalid")
        }

        sum += grade
        numberOfGrades++
        return this
    }

    fun average() : Double {
        return  sum / numberOfGrades
    }
}