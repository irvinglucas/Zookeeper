import java.util.Scanner

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)

    val empireShips = scanner.nextInt()
    val allianceShips = scanner.nextInt()

    println(empireShips / allianceShips)
}