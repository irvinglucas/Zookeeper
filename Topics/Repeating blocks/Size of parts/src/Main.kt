// const val's to avoid magic numbers
const val LARGER = 1
const val SMALLER = -1
const val PERFECT = 0

// var's to store the amount parts in each size of components
var largerParts = 0
var smallerParts = 0
var perfectParts = 0

fun main() {
    // gets the number of parts
    val numberOfParts = readln().toInt()

    // verify each input, to know which is what
    repeat(numberOfParts) {
        val input = readln().toInt()
        if (input == LARGER) largerParts++
        if (input == SMALLER) smallerParts++
        if (input == PERFECT) perfectParts++
    }

    // printing the output using string template
    println("$perfectParts $largerParts $smallerParts")
}