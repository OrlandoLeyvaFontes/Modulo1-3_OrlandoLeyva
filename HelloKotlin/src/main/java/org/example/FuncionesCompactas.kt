package org.example
import java.util.*

fun main() {
    println("Hello, World!")
    alimentarPeces()
    dirtyProcessor()
}

fun deberiasCambiarAgua(
    dia: String,
    temperatura: Int = 22,
    suciedad: Int = 20
): Boolean {
    val estaMuyCaliente = temperatura > 30
    val estaSucio = suciedad > 30
    val esDomingo = dia == "Sunday"

    return when {
        estaMuyCaliente -> true
        estaSucio -> true
        esDomingo -> true
        else -> false
    }
}

fun estaDemasiadoCaliente(temperatura: Int): Boolean = temperatura > 30

fun alimentarPeces() {
    val dia = diaAleatorio()
    val comida = comidaPeces(dia)
    println("Today is $dia and the fish eat $comida")
    deberiasCambiarAgua(dia, temperatura = 20, suciedad = 50)
    deberiasCambiarAgua(dia, suciedad = 50)

    if (deberiasCambiarAgua(dia)) {
        println("Change the water today")
    }
}

fun diaAleatorio(): String {
    val semana = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return semana[Random().nextInt(7)]
}

fun comidaPeces(dia: String): String {
    return when (dia) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

var dirty = 20

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty) { dirty -> dirty + 50 }

    println("Final dirty level: $dirty")
}