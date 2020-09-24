import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Fathoms: ")
    val f = sc.nextInt()
    print("Arshins: ")
    val a = sc.nextInt()
    print("Vershoks: ")
    val v = sc.nextInt()
    println()
    println("Length: ${f * 48 * 4.445 + a * 16 * 4.445 + v * 4.445} cm")
}