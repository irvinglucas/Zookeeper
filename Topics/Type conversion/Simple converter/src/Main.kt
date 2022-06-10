import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val text: String = scanner.nextLine()

    println(text.toInt())
    println(text.toDouble())
    println(text.toBoolean())
}