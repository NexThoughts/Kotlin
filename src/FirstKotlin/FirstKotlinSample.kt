package FirstKotlin

/**
 * Created by chetan on 13/7/16.
 */
fun main(args: Array<String>) {
    println("Hello, World!")
//    var jake = Person()
//    jake.name = "Jake Hill"
//    jake.age = 24
//    jake.college = "Stephen's College"
    var jake = Person("Jake Hill", 24, "Stephen's College")
var jon = Person("Jake Hill", 27, "Stephen's College", "jake.hill@example.com")

    println(jake.age)

    println(jon.age)
    println(jon.email)
    //adding member function
    println(jake.isEligibleToVote())
}

