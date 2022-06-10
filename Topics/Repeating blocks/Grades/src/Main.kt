// const val's to avoid magic numbers
const val D = 2
const val C = 3
const val B = 4
const val A = 5

fun main() {
    val amountOfStudents = readln().toInt()

    // variables to keep the count of grades
    var amountOfAgrades = 0
    var amountOfBgrades = 0
    var amountOfCgrades = 0
    var amountOfDgrades = 0

    // this loop repeats its operation according to the amount of students
    repeat(amountOfStudents) {
        val input = readln().toInt()
        if (input == D) amountOfDgrades++
        if (input == C) amountOfCgrades++
        if (input == B) amountOfBgrades++
        if (input == A) amountOfAgrades++
    }

    // printing the output using string template
    println("$amountOfDgrades $amountOfCgrades $amountOfBgrades $amountOfAgrades")
}