package Aquarium

fun main(args: Array<String>) {
    val allBooks = listOf("some shake book 1", "hamlet", "some shake book 3", "some shake book 4")
    val library = mapOf("Shakespeare" to allBooks)
    library.any { it.value.contains("hamlet") }
    val moreBooks = mutableMapOf("newbook" to "someauthor")
    moreBooks.getOrPut("newbook1") {"someauthor1"}
}

object MobyDick {
    val author = "Herman Melville"

    fun jump() {

    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

sealed class Seal