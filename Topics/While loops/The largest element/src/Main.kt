fun main() {
    var input = readln().toInt()
    var largestNumber = 0
    while (input != 0) {
        if (input > largestNumber) { largestNumber = input }
        else input = readln().toInt()
    }

    print(largestNumber)
}