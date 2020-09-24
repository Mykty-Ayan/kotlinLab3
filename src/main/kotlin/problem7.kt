import java.util.*
import kotlin.Exception

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter h1: ")
    val h1 = sc.nextInt()
    print("Enter m1: ")
    val m1 = sc.nextInt()
    print("Enter h2: ")
    val h2 = sc.nextInt()
    print("Enter m2: ")
    val m2 = sc.nextInt()
    if(h1 > 23 || h2 > 23){
        throw NotValidInput("Enter valid hours")
    }
    if (m1 > 60 || m2 > 60){
        throw NotValidInput("Enter valid minutes")
    }
    println("Travel time: ${(h2 * 60 + m2) - (h1 * 60 + m1)}")
}

class NotValidInput(message: String): Exception(message) {
}