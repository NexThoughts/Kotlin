package Inheriance

/**
 * Created by chetan on 15/7/16.
 */
class Employee(name: String, age: Int, college: String?, var company: String) : Person(name, age, college) {
override fun isEligibleToVote(): Boolean {
    // Always return true
    return age>=10
}
}
