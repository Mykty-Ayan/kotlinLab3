import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter s: ")
    val s = sc.nextInt()
    print("Enter p: ")
    val p = sc.nextInt()
    var interest = s.toDouble()
    var i = 0
    while (i < 3){
        interest += interest*p/100
        i++
    }
    println("Total: $interest")
}