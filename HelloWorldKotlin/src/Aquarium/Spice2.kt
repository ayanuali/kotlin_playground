package Aquarium

class Spice(val name: String, val spiciness: String = "mild") {
    private val heat: Int
        get() : Int {
            return when(spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    init {
        println(spices1)
    }

    val spice = Spice("cayenne", spiciness = "spicy")

    val spicelist = spices1.filter {it.heat < 5}

    fun makeSalt() = Spice("Salt")
}

abstract class Spice3 {

}

class SomeSpice1: Spice3() {

}

class SomeSpice2: Spice3() {

}