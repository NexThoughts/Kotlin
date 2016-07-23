package Loops

/**
 * Created by chetan on 18/7/16.
 */
fun main(args: Array<String>) {
    val names = arrayOf("Jake", "Jill", "Ashley", "Bill")

    for (name in names) {
        println(name)
    }

    //val cannot be reassigned
var i=names.size
    while(i>0) {
        println(names[--i])
    }
}