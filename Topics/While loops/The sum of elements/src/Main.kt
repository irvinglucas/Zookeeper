fun main() {
    var result = 0
    var input = readln().toInt()

    while (input != 0) {
        result += input
        input = readln().toInt()
    }
    print(result)
}