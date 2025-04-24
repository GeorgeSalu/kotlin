package properties

fun main() {

    val r1 = Rectangle(10,3)
    println(r1.width)
    println(r1.height)

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