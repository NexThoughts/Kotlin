package Extensions

/**
 * Created by chetan on 15/7/16.
 */
fun String.containsSpaces(): Boolean {
    return this.contains(" ")
}
fun main(args: Array<String>)
    {
        val str="Hi chetan"
        println(str.containsSpaces())
    }
