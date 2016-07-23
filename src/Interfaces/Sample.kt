package Interfaces

/**
 * Created by chetan on 23/7/16.
 */
interface MyInterface {
    val property: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(property)
    }
}

class Child : MyInterface {
    override val property: Int = 29
}

fun main(args: Array<String>) {
    var child = Child()
    println(child.propertyWithImplementation)
    println(child.foo())
}