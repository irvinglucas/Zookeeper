

fun main() {
    var number = readln().toInt()
    var output = ""

    while(number != 1 ) {

        if (number % 2 == 0) {
            // concatenating the actual value with a space and the new number using string template
            output += " $number"
            number /= 2

        } else {
            // concatenating the actual value with a space and the new number using string template
            output += " $number"
            number = (number * 3) + 1

        }
    }
    if (number == 1) output += " $number"
    print(output)
}