package lesson5

fun main(args: Array<String>) {
    val symptoms = mutableListOf("white spots", "red sports", "not eating", "bloated", "belly up")

    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    println(symptoms.subList(4, symptoms.size))
    listOf(1,5,3).sum()
    listOf("a", "b", "cc").sumOf { it.length } // 4
}