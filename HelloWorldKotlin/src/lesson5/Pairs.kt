package lesson5

fun main(args: Array<String>) {
    val book = Book("X", "Y", "Z")
    val (title, author, year) = book.returnTriple()
    println("Here is ${title} written by ${author} in ${year}")
}

const val MAX_NUMBER_BOOKS_TO_BORROW = 4

//object Constants {
//    const val BASE_URL = "some_url"
//}

class Book(val title: String, val author: String, val year: String) {
    companion object {
        const val BASE_URL = "some_url"
    }
    fun titleAuthor(): Pair<String, String> {
        return title to author
    }

    fun returnTriple(): Triple<String, String, String> {
        return Triple(title, author, year)
    }

    fun canBorrow(numbBooks: Int) : Boolean {
        return (numbBooks < MAX_NUMBER_BOOKS_TO_BORROW)
    }

    fun printUrl() : String {
        return BASE_URL + title + ".html"
    }
}