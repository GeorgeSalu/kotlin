package br.com.secao4

fun main() {

    val myInt = 199
    val aInt: Int = 7

    val lowest = if (myInt < aInt) myInt else aInt

    val temp = 26
    val isAirConditionerOn = if (temp >= 26) {
        println("it is warn")
        true
    } else {
        println("it is nor warn")
        false
    }

    println("is the air conditioner on: $isAirConditionerOn")
}