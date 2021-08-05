package Spices

fun main(args: Array<String>) {

}

abstract class Spice3() {
    abstract val heat: Int
    abstract fun prepareSpice()
}

interface Grinder {
    fun grind()
}

//testing git
class Curry: Spice3(), Grinder, SpiceColor by YellowColor {
    override fun prepareSpice() {
        println("curry")
    }

    override val heat: Int
        get() = 5

    override fun grind() {
        println("grind")
    }
}

interface SpiceColor {
    val color: String
}

object YellowColor: SpiceColor {
    override val color: String
        get() = "yellow color"
}
