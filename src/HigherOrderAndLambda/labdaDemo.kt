package HigherOrderAndLambda
fun main(args: Array<String>) {
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    val actualSum = sumLambda(3, 4)
    println(actualSum)
}