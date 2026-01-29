package org.example

import java.util.*

fun main() {
    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    println(myList)

    val school = arrayOf("tuna", "salmon", "shark")
    val numbers = intArrayOf(1, 2, 3)

    var fish = 12
    var plants = 5
    val swarm = listOf(fish, plants)
    val bigSwarm = arrayOf(swarm, arrayOf("dolphin", "whale", "orka"))
    println(Arrays.toString(bigSwarm))

    for (element in swarm) println(element)

    for ((index, element) in swarm.withIndex()) {
        println("Fish at $index is $element")
    }

    for (i in 'b'..'g') print(i)
    println()

    for (i in 1..5) print(i)
    println()

    for (i in 5 downTo 1) print(i)
    println()

    for (i in 3..6 step 2) print(i)
    println()
}