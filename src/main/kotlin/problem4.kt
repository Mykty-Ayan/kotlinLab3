import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Degrees: ")
    val d = sc.nextInt()
    print("Minutes: ")
    val m = sc.nextInt()
    print("Seconds: ")
    val s = sc.nextInt()
    val rad = Math.PI/180
    println()
    println("${(d + (m + s/60)/60)*rad}")
}