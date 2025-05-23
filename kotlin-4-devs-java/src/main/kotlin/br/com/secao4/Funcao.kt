package br.com.secao4

fun main() {

    println("10 + 20 = ${myMathFunction(10, 20)}")
    println("10 + 20 = ${myExpressionBodyFunction(10, 20)}")
    println("10 + 20 = ${myExpressionBodyFunctionWithInference(10, 20)}")
    println("default sum = ${myFunctionWithDefaults(10, 20, "Hello")}")
}

fun myMathFunction(number1: Int,number2: Int): Int {
    return number1 + number2
}

fun myExpressionBodyFunction(number1: Int,number2: Int): Int = number1 + number2

fun myExpressionBodyFunctionWithInference(number1: Int,number2: Int) = number1 + number2

fun myFunctionWithDefaults(number1: Int = 1,number2: Int = 5,message: String) : Int {
    val results = number1 + number2
    println(message)
    return results
}