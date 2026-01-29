package org.example
fun main() {
    // Ejemplo 1: val vs var
    val aquarium = 1
    println(aquarium)

    var fish = 2
    println(fish)
    fish = 50
    println(fish)

    val plants = 5
    val fish2 = 2
    println(fish2 + plants)  // 7

    // Ejemplo 2: Tipos nullables

    var marbles: Int? = null
    println(marbles)

    var lotsOfFish: List<String?> = listOf(null, null)
    println(lotsOfFish)

    var everMoreFish: List<String>? = null
    println(everMoreFish)

    var definitelyFish: List<String?>? = null
    definitelyFish = listOf(null, null)
    println(definitelyFish)

    // Ejemplo 3: Null safety
    var goldfish: Goldfish? = Goldfish()
    goldfish!!.eat()

    goldfish = null
}

// Clase de ejemplo para el ejercicio de null safety
class Goldfish {
    fun eat() {
        println("Yum")
    }
}