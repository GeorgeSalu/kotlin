package classes_e_objetos

/*
* Exercicio
*
* Crie uma classe Person para representar uma pessoa. Uma pessoa pode andar e, toda vez que anda, ela anda 1000m
* de uma so vez. ao percorrer 5000m, ela não consegue mas andar e so volta a andar se tomar agua (depois disso ela
* pode anda mais 5000m)
*
* Crie um programa que simula a caminhada de uma pessoa durante determinada periodo, mostrando ao final qual fio a
* distancia percorrida
* */
fun main() {

    val p1 = Person()

    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.drinkWater()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()

    println("A pessoa andou ${p1.end()}m")

    val p2 = Person(1000)

    p2.walk()
    p2.walk()
    p2.walk()

    println("A pessoa andou ${p2.end()}m")
}

private class Person(
    private val initialDistanceToWater: Int = 5000
) {

    private var distance = 0
    private var distanceToWater: Int = initialDistanceToWater

    fun walk() {
        if(distanceToWater > 0) {
            distance += 1000
            distanceToWater -= 1000
        }
    }

    fun drinkWater() {
        distanceToWater = initialDistanceToWater
    }

    fun end(): Int {
        return distance
    }

}