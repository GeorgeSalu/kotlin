package properties

fun main() {

    val r1 = Rectangle(10,3)
    r1.width = 10
    println(r1.width)

}

class Rectangle(
    width: Int, height: Int
) {

    var width: Int = 0
        get() {
            return field * 2
        }
        set(value) {
            if(value >= 0) {
                field = value
            }
        }


    var height: Int = 0
        set(value) {
            if(value >= 0) {
                field = value
            }
        }
}