fun main() {
    val number = readln().toInt()

    if (number < 0) {
        print("negative")
    } else if (number > 0) {
        print("positive")
    } else {
        print("zero")
    }
}