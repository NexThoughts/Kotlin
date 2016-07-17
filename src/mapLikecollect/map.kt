package mapLikecollect
fun main(args: Array<String>)
{
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    val squaredNumbers = numbers.map({ x -> x * x })

//     Result will be a new array that contains
//     1, 4, 9, 16, 25
}