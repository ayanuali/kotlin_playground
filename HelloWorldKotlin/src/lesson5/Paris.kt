package lesson5

fun main(args: Array<String>) {
    val book = Book("X", "Y", "Z")
    val (title, author, year) = book.returnTriple()
    println("Here is ${title} written by ${author} in ${year}")
}

class Book(val title: String, val author: String, val year: String) {
    fun titleAuthor(): Pair<String, String> {
        return title to author
    }

    fun returnTriple(): Triple<String, String, String> {
        return Triple(title, author, year)
    }
}