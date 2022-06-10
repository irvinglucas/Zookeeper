import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val fraction = scanner.nextDouble()

    val converted = fraction.toLong()

    println(converted)

}