import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val time = sc.nextLine()
    val pattern = Regex("(^([0-9]{1,2}):([0-9]{2}):([0-9]{2})$)")
    time.toRegex()
    if (pattern.containsMatchIn(time)){
        time.toCharArray()
        val timeArray = time.split(":")
        val numbers = timeArray.map { it.toString().toInt()}
        val hours = numbers[0] * 60 * 60
        val minutes = numbers[1] * 60
        println("Time in seconds: ${hours + minutes + numbers[2]}")
    }
}