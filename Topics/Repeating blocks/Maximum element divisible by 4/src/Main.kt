const val FOUR = 4

fun main() {
    val quantityOfElements = readln().toInt()
    var maximumElement = 0

    repeat(quantityOfElements) {
        val number = readln().toInt()
        if (number % FOUR == 0 && number > maximumElement) maximumElement = number
    }

    print(maximumElement)
}

