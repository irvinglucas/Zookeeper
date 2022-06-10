private const val FIRST_INDEX = 0
private const val TENTH_INDEX = 9
private const val LAST_INDEX = 99
private const val LIST_SIZE = 100

private const val FIRST_NUMBER = 1
private const val TENTH_NUMBER = 10
private const val LAST_NUMBER = 100

fun main() {
    val numbers = MutableList(LIST_SIZE) { 0 }

    // magic numbers are hard-coded numbers. 0 and 1 are exceptions to this rule
    numbers[0] = FIRST_NUMBER
    numbers[TENTH_INDEX] = TENTH_NUMBER
    numbers[LAST_INDEX] = LAST_NUMBER

    // do not touch the lines below 
    println(numbers.joinToString())
}