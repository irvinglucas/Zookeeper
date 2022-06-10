fun main() {
    val number = readln().toInt()

    if (number > -15 && number <= 12 || number > 14 && number < 17 || number >= 19) print("True")
    else print("False")
}