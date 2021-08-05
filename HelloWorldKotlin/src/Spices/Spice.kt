package Spices

fun main(args: Array<String>) {

}

fun delegate() {
    val curry = Curry()
    println("spice color ${curry.color}")
}

abstract class Spice3() {
    abstract val heat: Int
    abstract fun prepareSpice()
}

interface Grinder {
    fun grind()
}

//testing git
class Curry(spiceColor: SpiceColor = YellowColor): Spice3(), Grinder, SpiceColor by spiceColor {
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
