import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("x1: ")
    val x1 = sc.nextInt()
    print("y1: ")
    val y1 = sc.nextInt()
    print("x1: ")
    val x2 = sc.nextInt()
    print("y1: ")
    val y2 = sc.nextInt()
    println()
    println("Distance is: ${kotlin.math.sqrt(((x2-x1)*(x2-x1.toDouble())) + ((y2-y1)*(y2-y1.toDouble())))}")
}