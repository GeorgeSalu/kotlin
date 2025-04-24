package properties

fun main() {

    val r1 = Rectangle()
    r1.width = 10
    println(r1.width)

}

class Rectangle {

    var width: Int = 0
        get() {
            return field * 2
        }
        set(value) {
            if(value >= 0) {
                field = value
            }
        }

}