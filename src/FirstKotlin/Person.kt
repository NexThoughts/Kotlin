package FirstKotlin

//class Person
//{
//    var name: String = ""
//var age: Int = 0
//    var college: String? = null
//}

class Person(var name: String, var age: Int, var college: String?)
{
//intialiazation
    init {
        println("Customer initialized with value ${name}")
    }
//adding more constructor called as  Secondary constructors
    var email: String = ""

    constructor(name:String, age:Int, college: String?, email: String) : this(name, age, college) {
        this.email = email
    }


    fun isEligibleToVote(): Boolean {
        // If age is greater or equal to 18
        // return true

        return age >= 18
    }

}
var jake = Person("Jake Hill", 24, "Stephen's College")

