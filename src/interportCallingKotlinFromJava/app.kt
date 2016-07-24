package interportCallingKotlinFromJava;
import interportCallingKotlinFromJava.Person

fun Person.isAdult(): Boolean {

    // If age falls in the range
    // 13-19 return true
    return age in 20..30
}
