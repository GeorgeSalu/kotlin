package operators

fun main() {

    // and
    println("T and T ${true && true}")
    println("T and F ${true && false}")
    println("F and T ${false && true}")
    println("F and F ${false && false}")

    println()

    // or
    println("T or T ${true || true}")
    println("T or F ${true || false}")
    println("F or T ${false || true}")
    println("F or F ${false || false}")

    println()

    // not
    println("not F ${!false}")
    println("not T ${!true}")

}