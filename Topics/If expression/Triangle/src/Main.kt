fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    if (c <  a + b && b < a + c && a < b + c)
        if (c > a - b && b > a - c && a > b - c) print("YES")
}