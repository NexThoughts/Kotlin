package FirstKotlin

/**
 * Created by chetan on 13/7/16.
 */
fun main(args: Array<String>) {

    val a: Int = 1
    val b = 1   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 1       // definite assignment

    val familyName: String = ""
    val address: String? = null
    //val length = address.length

    println("Hello, World!")
    var jake = Person("Jake Hill", 24, "Stephen's College")
    var jon = Person("Jake Hill", 27, "Stephen's College", "jake.hill@example.com")

    println(jake.age)

    println(jon.age)
    println(jon.email)
    //adding member function
    println(jake.isEligibleToVote())
}

