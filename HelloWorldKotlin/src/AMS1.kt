import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")
    feedTheFish()
//    println(canFitMoreFish(10.0, listOf(3, 3, 3)))
//    println(canFitMoreFish(8.0, listOf(2, 2, 2), hasDecorations = false))
//    println(canFitMoreFish(9.0, listOf(1, 1, 3), 3))
//    println(canFitMoreFish(10.0, listOf(), 7, true))
    repeat(2) {
        println("fish is swimming")
    }

    //lamdas
    var dirty = 20
    var waterFilter = {dirty: Int -> dirty / 2}
//    var waterFilter: (Int) -> Int = {dirty -> dirty / 2}
    println(waterFilter(dirty))

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    //Create a filter that gets all the curries and sorts them by string length.
    println(spices.filter { it.contains("curry") }.sortedBy { it.length })

    //Filter the list of spices to return all the spices that start with 'c' and end in 'e'. Do it in two different ways.
    println(spices.filter { it.startsWith('c') }.filter { it.endsWith('e') })
    //second way
    println(spices.filter { it.startsWith('c') && it.endsWith('e') })

    //Take the first three elements of the list and return the ones that start with 'c'.
    println(spices.take(3).filter { it.startsWith('c') })
}

fun canFitMoreFish(
    tankSize: Double, currentFish: List<Int>,
    fishSize: Int = 2, hasDecorations: Boolean = true
): Boolean {
    var canAddFish = false;
    var currentTotalSize = 0
    for (item in currentFish) {
        currentTotalSize += item
    }

    if (hasDecorations && currentTotalSize < tankSize * 0.8)
        canAddFish = (currentTotalSize + fishSize <= tankSize * 0.8)
    else
        canAddFish = (currentTotalSize < tankSize) && (currentTotalSize + fishSize <= tankSize)

    return canAddFish
}

fun getDirtySensorReading() = 20

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {
    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

//if functions have one line of code inside
fun isTooHot(temperature: Int) = temperature == 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"


fun feedTheFish() {
    val day = randomDay()
    val food = foodFish(day)
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)

    if (shouldChangeWater(day))
        println("Change the water today")
}

fun foodFish(day: String): String {
    var food = "fasting"

    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }

    return food
}

fun randomDay(): String {
    val weekdays = listOf("Monday,", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return weekdays[Random().nextInt(7)]
}