package DataClasses



/**
 * Created by chetan on 23/7/16.
 */
data class Book(var title: String, var author: String)
val book = Book("Effective Java", "Joshua Bloch")
fun main(args: Array<String>) {
    println(book)
    println(book.title)
}

