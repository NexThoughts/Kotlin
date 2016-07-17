package HigherOrderAndLambda

fun doubleTheResult(x:Int, y:Int, f:(Int, Int)->Int): Int {
    return f(x,y) * 2
}

fun main(args: Array<String>) {

    val result2 = doubleTheResult(3, 4, {x,y -> x+y})
    print(result2)
}