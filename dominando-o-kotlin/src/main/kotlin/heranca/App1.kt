package heranca

fun main() {

    val dog = Dog("preto")
    val cat = Cat("Cinza")

    var a: Animal = dog
    var b: Animal = cat

    println(dog is Dog)
    println(dog is Animal)
    println(cat is Animal)


}