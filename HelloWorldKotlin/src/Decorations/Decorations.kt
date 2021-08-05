package Decorations

fun main(args: Array<String>) {
    val d1 = Decorations("granite")
    val d2 = Decorations("slate")
    val d3 = Decorations("slate")
    println(d1)
    println(d2)
    println(d3)

    println(d1.equals(d2))
    println(d2.equals(d3))
}

data class Decorations(val rocks: String) {}