package Inheriance

open class Person(var name: String, var age: Int, var college: String?)
{

    open fun isEligibleToVote(): Boolean {
        // If age is greater or equal to 18
        // return true

        return age >= 18
    }

}
