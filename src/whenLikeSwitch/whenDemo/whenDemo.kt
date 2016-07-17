package whenLikeSwitch.whenDemo
fun main(args: Array<String>) {
    val age = 17


    val typeOfPerson = when (age) {
        0 -> "New born"
        in 1..12 -> "Child"
        in 13..19 -> "Teenager"
        else -> "Adult"
    }

}   