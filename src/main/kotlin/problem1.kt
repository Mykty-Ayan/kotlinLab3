import kotlin.random.Random

fun main() {
    val random = (32..122).random()
    if(random.toChar().isDigit()){
        print("$random is digit")
    }
    else if(random.toChar().isLetter()){
        print("$random is Letter")
    }

}