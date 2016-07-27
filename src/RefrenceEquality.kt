import Inheriance.Employee


fun main(args: Array<String>) {


    var person1= Employee("Jake Hill", 11, "Stephen's College", "Raymond")
    var person2= Employee("Jake Hill", 11, "Stephen's College", "Raymond")
    var person3=person1
    println(person1===person2)
    println(person1==person2)


}