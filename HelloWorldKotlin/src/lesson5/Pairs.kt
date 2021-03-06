package lesson5

import kotlin.random.Random

fun main(args: Array<String>) {
    val book = Book("X", "Y", "Z")
    val (title, author, year) = book.returnTriple()
    println("Here is ${title} written by ${author} in ${year}")

    val puppy = Puppy()
//    val book1 = Book("Oliver Twist", "Charles Dickens", 1837, 540)

//    while (book1.pages > 0) {
//        puppy.playWithBook(book1)
//        println("${book1.pages} left in ${book1.title}")
//    }
//    println("Sad puppy, no more pages in ${book1.title}. ")
}

const val MAX_NUMBER_BOOKS_TO_BORROW = 4

//object Constants {
//    const val BASE_URL = "some_url"
//}

var pages = 300

fun Book.weight() : Double {return pages*1.5}

fun Book.tornPages(numberOfTornPages: Int) = if (pages >= numberOfTornPages) pages -= numberOfTornPages else pages = 0

class Puppy {
    fun playWithBook(book: Book) {
        val randomPages = Random.nextInt(12)
        println(randomPages)
        if(pages > 0)
        book.tornPages(randomPages)
    }
}

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