import Inheriance.Employee


fun main(args: Array<String>) {


data class IntWrapper(val value: Int)
data class IntPair(val key: Int) {
    var value: Int? = null
}

val a = IntWrapper(1)
val b = IntWrapper(1)
println(a == b) // true, as a structural equality is compared
println(a === b) // false

}