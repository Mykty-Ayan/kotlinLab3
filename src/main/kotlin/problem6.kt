import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter integer greater than 100: ")
    var digit = sc.nextInt()
    if (digit > 99){
        digit /= 100
        digit %= 10
        println(digit)
    }
}