fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.

    val auxiliary = numbers.last()
    numbers[numbers.lastIndex] = numbers[0]
    numbers[0] = auxiliary

    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}