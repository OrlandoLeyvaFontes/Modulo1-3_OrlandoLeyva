package org.example

fun main() {
    val fish = "fish"
    val plant = "plant"
    println(fish == plant)
    println(fish == fish)
    println(fish != plant)

    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) println("Good ratio!")
    else println("unhealthy ratio")

    val fishCount = 50
    if (fishCount in 1..100) println(fishCount)

    when (numberOfFish) {
        0 -> println("Empty tank")
        50 -> println("Full tank")
        else -> println("Perfect!")
    }
}